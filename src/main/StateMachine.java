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
	private Transition currentTransition;

	public Machine build() {
		return new Machine(states, integers, current, initial);
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
		currentEvent = string;
		return this;
	}

	public StateMachine to(String string) {
		currentTransition = new Transition(currentEvent, getState(string));

		current.addTransition(currentTransition);
		return this;
	}

	public StateMachine integer(String string) {
		if (!integers.containsKey(string)) {
			integers.put(string, 0);
		}
		return this;
	}

	public StateMachine set(String string, int i) {
		currentTransition.setSetOperation(true);
		currentTransition.setOperationVariableName(string);
		integers.put(string, i);
		return this;
	}

	public StateMachine increment(String string) {
		currentTransition.setSetOperation(false);
		currentTransition.setIncrementOperation(true);
		currentTransition.setOperationVariableName(string);
		integers.put(string, integers.getOrDefault(string,0) + 1);
		return this;
	}

	public StateMachine decrement(String string) {
		currentTransition.setSetOperation(false);
		currentTransition.setDecrementOperation(true);
		currentTransition.setOperationVariableName(string);
		integers.put(string, integers.getOrDefault(string,0) - 1);
		return this;
	}

	public StateMachine ifEquals(String string, int i) {
		currentTransition.setCondition(true);
		currentTransition.setConditionEqual(true);
		currentTransition.setConditionalVariableName(string);
		currentTransition.setConditionComparedValue(i);
		return this;
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
