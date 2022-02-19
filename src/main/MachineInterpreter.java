package main;

import java.util.HashMap;

import main.metamodel.Machine;
import main.metamodel.State;
import main.metamodel.Transition;

public class MachineInterpreter {
	Machine machine;
	State current;
	HashMap<String, Integer> integers = new HashMap<String, Integer>();

	public void run(Machine m) {
		machine = m;
		current = m.getInitialState();
	}

	public State getCurrentState() {
		return current;
	}

	public void processEvent(String string) {
		Transition temp = current.getTransitionByEvent(string);
		if (temp != null) {
			if (temp.isConditionEqual()) {
				if (machine.getInteger(temp.getConditionVariableName()) == temp.getConditionComparedValue()) {
					current = temp.getTarget();
				}
			}
			else if (temp.isConditionGreaterThan()) {
				if (machine.getInteger(temp.getConditionVariableName()) > temp.getConditionComparedValue()) {
					current = temp.getTarget();
				}
			}
			else if (temp.isConditionLessThan()) {
				if (machine.getInteger(temp.getConditionVariableName()) < temp.getConditionComparedValue()) {
					current = temp.getTarget();
				}
			} else {
				current = temp.getTarget();
			}
		}
	}

	public int getInteger(String string) {
		return machine.getInteger(string);
	}

}
