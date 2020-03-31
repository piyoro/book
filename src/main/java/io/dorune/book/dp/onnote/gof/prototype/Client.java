package io.dorune.book.dp.onnote.gof.prototype;

import java.util.HashMap;

public class Client {

	private AbstractOperationPrototype operationPrototype;

	private HashMap<String, AbstractOperationPrototype> operationPrototypeMap;

	public Client() {
		super();

		initOperationMap();
	}

	public void operate() {
		operationPrototype.operate();
	}

	public void setOperation(String operator, int firstNumber, int secondeNumber) {
		operationPrototype = getOperationClone(operator);

		operationPrototype.setFirstNumber(firstNumber);
		operationPrototype.setSecondNumber(secondeNumber);
	}

	private void initOperationMap() {
		operationPrototypeMap = new HashMap<String, AbstractOperationPrototype>();

		operationPrototypeMap.put("+", new AddOperationPrototype());
		operationPrototypeMap.put("-", new SubstractOperationPrototype());
		operationPrototypeMap.put("*", new MultiplyOperationPrototype());
		operationPrototypeMap.put("/", new DivideOperationPrototype());
	}

	private AbstractOperationPrototype getOperationClone(String operator) {
		AbstractOperationPrototype operation = operationPrototypeMap.get(operator);
		return operation.getClone();
	}

	public static void main(String[] args) throws Exception {
		Client client = new Client();

		int firstNumber = 100;
		int secondNumber = 20;

		String[] operators = { "+", "-", "*", "/" };

		for (int i = 0; i < operators.length; i++) {
			client.setOperation(operators[i], firstNumber, secondNumber);
			client.operate();
		}
	}
}
