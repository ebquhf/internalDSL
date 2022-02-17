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

	public StateMachine state(String string) {
		if(!states.containsKey(string)) states.put(string, new State(string));
		 current=states.get(string);
		return this;
	}

	public StateMachine initial() {
		initial=current;
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
