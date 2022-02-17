package main;

import java.util.HashMap;

import main.metamodel.Machine;
import main.metamodel.State;
import main.metamodel.Transition;

public class StateMachine {
	private HashMap<String, State> states = new HashMap<String, State>();
	private HashMap<String, Integer> integers = new HashMap<String, Integer>();
	private State current;
	private State initial;
	private String currentEvent;
	
	public Machine build() {
		return new Machine(states,integers, current, initial);
	}

	private State getState(String name) {
		if (!states.containsKey(name))
			states.put(name, new State(name));
		return states.get(name);
	}

	public StateMachine state(String string) {
		current = getState(string);
		return this;
	}

	public StateMachine initial() {
		initial = getState(current.getName());
		return this;
	}

	public StateMachine when(String string) {
		currentEvent=string;
		return this;
	}

	public StateMachine to(String string) {
		Transition temp = new Transition(currentEvent,getState(string));
		
		current.addTransition(temp);
		return this;
	}

	public StateMachine integer(String string) {
		if (!integers.containsKey(string)) {
			integers.put(string, null);
		}
		return this;
	}

	public StateMachine set(String string, int i) {
		integers.put(string, i);
		return null;
	}

	public StateMachine increment(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public StateMachine decrement(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public StateMachine ifEquals(String string, int i) {
		// TODO Auto-generated method stub
		return null;
	}

	public StateMachine ifGreaterThan(String string, int i) {
		// TODO Auto-generated method stub
		return null;
	}

	public StateMachine ifLessThan(String string, int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
