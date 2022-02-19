package main.metamodel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Machine {

	HashMap<String, State> states = new HashMap<String, State>();
	HashMap<String, Integer> integers = new HashMap<String, Integer>();
	
	State initial;
	State current;
	public Machine(HashMap<String, State> states2, HashMap<String, Integer> integers2 ,State current, State initial) {
		this.states=states2;
		this.integers=integers2;
		this.initial=initial;
		this.current=current;
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
		return integers.size();
	}

	public boolean hasInteger(String string) {
		return integers.containsKey(string);
	}
	public Integer getInteger(String string) {
	 if(hasInteger(string)) {
		 return integers.get(string);
	 }
	return 0;
	}
}
