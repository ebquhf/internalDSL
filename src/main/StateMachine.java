package main;

import java.util.HashMap;

import main.metamodel.Machine;
import main.metamodel.State;

public class StateMachine {
	private HashMap<String,State> states = new HashMap<String,State>();
	private State current;
	private State initial;
	
	public Machine build() {
		// TODO Auto-generated method stub
		return new Machine(states,current,initial);
	}
	private State getState(String name) {
		if(!states.containsKey(name)) states.put(name, new State(name));
		return states.get(name);
	}
	public StateMachine state(String string) {
		 current=getState(string);
		return this;
	}

	public StateMachine initial() {
		initial=getState(current.getName());
		return this;
	}

	public StateMachine when(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public StateMachine to(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public StateMachine integer(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public StateMachine set(String string, int i) {
		// TODO Auto-generated method stub
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
