package main;

import main.metamodel.Machine;
import main.metamodel.State;

public class MachineInterpreter {
	Machine machine;
	State current;
	public void run(Machine m) {
		machine=m;
		current=m.getInitialState();
	}

	public State getCurrentState() {
		return current;
	}

	public void processEvent(String string) {
		// TODO Auto-generated method stub
		
	}

	public int getInteger(String string) {
		// TODO Auto-generated method stub
		return 0;
	}

}
