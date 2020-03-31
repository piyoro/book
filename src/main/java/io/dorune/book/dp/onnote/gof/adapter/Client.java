package io.dorune.book.dp.onnote.gof.adapter;

public class Client {

	public static void main(String[] args) {

		int firstNumber = 100;
		int secondNumber = 20;

		AbstractOperationTarget operationTarget = new AddOperation();

		int answer = operationTarget.operate(firstNumber, secondNumber);

		System.out.println(firstNumber + " + " + secondNumber + " = " + answer);

		operationTarget = new SubstractOperation();
		answer = operationTarget.operate(firstNumber, secondNumber);

		System.out.println(firstNumber + " - " + secondNumber + " = " + answer);

		operationTarget = new MultiplyOperation();
		answer = operationTarget.operate(firstNumber, secondNumber);

		System.out.println(firstNumber + " * " + secondNumber + " = " + answer);

		OperationAdaptee operationAdaptee = new OperationAdaptee();

		operationTarget = new DivideOperationAdapter(operationAdaptee);
		answer = operationTarget.operate(firstNumber, secondNumber);

		System.out.println(firstNumber + " / " + secondNumber + " = " + answer);

	}

}
