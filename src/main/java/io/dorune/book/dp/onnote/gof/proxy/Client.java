package io.dorune.book.dp.onnote.gof.proxy;

public class Client {

	public static void main(String[] args) throws Exception{

		int firstNumber = 100;
		int secondNumber = 20;
		
		int result;
		
		AbstractOperationSubject operationSubject = new AddOperationSubject();				
		result = operationSubject.operate(firstNumber, secondNumber);
		
		System.out.println(firstNumber + " + " + secondNumber + " = " + result);
		
		operationSubject = new SubstractOperationSubject();				
		result = operationSubject.operate(firstNumber, secondNumber);
		
		System.out.println(firstNumber + " - " + secondNumber + " = " + result);
		
		operationSubject = new MultiplyOperationSubject();				
		result = operationSubject.operate(firstNumber, secondNumber);
		
		System.out.println(firstNumber + " * " + secondNumber + " = " + result);
		
		operationSubject = new DivideOperationProxy(new DivideOperationSubject());		
		result = operationSubject.operate(firstNumber, secondNumber);
		
		System.out.println(firstNumber + " / " + secondNumber + " = " + result);

		operationSubject = new DivideOperationProxy(new DivideOperationSubject());

		firstNumber = 10;
		secondNumber = 0;

		try {
			result = operationSubject.operate(firstNumber, secondNumber);
			
			System.out.println(firstNumber + " / " + secondNumber + " = " + result);
		} catch (OperationException e) {			
			System.out.println(e.toString());
		}
		
	}

}
