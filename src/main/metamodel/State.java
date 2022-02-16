package main.metamodel;

import java.util.ArrayList;
import java.util.List;

public class State {
	private String name;
	private List<Transition> transitions = new ArrayList<>();

	public Object getName() {
		return name;
	}

	public List<Transition> getTransitions() {
		return transitions;
	}

	public Transition getTransitionByEvent(String string) {

		for (Transition t : transitions) {
			if (t.getEvent().equals(string)) {
				return t;
			}
		}
		return null;
	}

}
