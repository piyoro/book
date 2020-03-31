package io.dorune.book.dp.onnote.gof.observer;

public class Client {

	public static void main(String[] args) {

		OperationSubject operationSubject = new OperationSubject();

		AddOperationObserver addObserver = new AddOperationObserver(operationSubject);
		SubstractOperationObserver substractObserver = new SubstractOperationObserver(operationSubject);
		MultiplyOperationObserver multiplyObserver = new MultiplyOperationObserver(operationSubject);
		DivideOperationObserver divideObserver = new DivideOperationObserver(operationSubject);

		operationSubject.registerObserver(addObserver);
		operationSubject.registerObserver(substractObserver);
		operationSubject.registerObserver(multiplyObserver);
		operationSubject.registerObserver(divideObserver);

		int firstNumber = 100;
		int secondNumber = 20;

		operationSubject.setNumber(firstNumber, secondNumber);

		firstNumber = 200;
		secondNumber = -30;

		operationSubject.setNumber(firstNumber, secondNumber);

	}

}
