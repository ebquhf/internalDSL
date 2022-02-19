package main.metamodel;

public class Transition {

	String event;
	State target;
	boolean set;
	boolean inc;
	boolean dec;
	boolean condition;
	boolean conditionEQ;
	String operationVariableName;
	String conditionalVariableName;
	Integer conditionComparedValue;
	private boolean conditionGT;
	private boolean conditionLT;
	private boolean hasOperation;

	public Transition(String string, State state) {
		this.event = string;
		this.target = state;
	}

	public Object getEvent() {
		return event;
	}

	public State getTarget() {
		return target;
	}

	public void setSetOperation(boolean val) {
		set = val;
	}

	public void setIncrementOperation(boolean val) {
		inc = val;
	}

	public void setDecrementOperation(boolean val) {
		dec = val;
	}

	public boolean hasSetOperation() {
		return set;
	}

	public boolean hasIncrementOperation() {
		return inc;
	}

	public boolean hasDecrementOperation() {
		return dec;
	}

	public void setOperationVariableName(String name) {
		operationVariableName = name;
	}

	public String getOperationVariableName() {
		return operationVariableName;
	}

	public void setCondition(boolean val) {
		condition = val;
	}

	public boolean isConditional() {
		return condition;
	}

	public void setConditionalVariableName(String name) {
		conditionalVariableName = name;
	}

	public String getConditionVariableName() {
		return conditionalVariableName;
	}

	public void setConditionComparedValue(Integer val) {
		conditionComparedValue = val;
	}

	public Integer getConditionComparedValue() {
		return conditionComparedValue;
	}

	public void setConditionEqual(boolean val) {
		conditionEQ = val;
	}

	public boolean isConditionEqual() {
		return conditionEQ;
	}
	public void setConditionGreaterThan(boolean val) {
		conditionGT=val;
	}
	public boolean isConditionGreaterThan() {
		return conditionGT;
	}
	public void setConditionLessThan(boolean val) {
		conditionLT=val;
	}
	public boolean isConditionLessThan() {
		return conditionLT;
	}
	
	public void setHasOperation(boolean val) {
		hasOperation=val;
	}
	public boolean hasOperation() {
		return hasOperation;
	}

}
