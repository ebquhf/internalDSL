package main;

import main.metamodel.Machine;
import main.metamodel.State;
import main.metamodel.Transition;

public class MachineInterpreter {
	Machine machine;
	State current;

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
			current = temp.getTarget();
		}
	}

	public int getInteger(String string) {
		// TODO Auto-generated method stub
		return 0;
	}

}
