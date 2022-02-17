package main.metamodel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Machine {

	HashMap<String, State> states = new HashMap<String, State>();
	State initial;
	State current;
	public Machine(HashMap<String, State> states2, State current, State initial) {
		this.states=states2;
		
	}

	public List<State> getStates() {
		return  new ArrayList<State>(states.values());
	}

	public State getInitialState() {
		return initial;
	}

	public State getState(String string) {
		if(!states.containsKey(string)) states.put(string, new State(string));
		return states.get(string);
	}

	public int numberOfIntegers() {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean hasInteger(String string) {
		// TODO Auto-generated method stub
		return false;
	}

}
