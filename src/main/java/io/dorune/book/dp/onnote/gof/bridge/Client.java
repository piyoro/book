package io.dorune.book.dp.onnote.gof.bridge;

public class Client {

	public static void main(String[] args) throws Exception {

		int firstNumber = 100;
		int secondNumber = 20;

		OperationAbstraction operationAbstraction = new RefinedOperationAbstraction(new BaseOperation());

		System.out.println(firstNumber + " + " + secondNumber + " = " + operationAbstraction.add(firstNumber, secondNumber));
		System.out.println(firstNumber + " - " + secondNumber + " = " + operationAbstraction.substract(firstNumber, secondNumber));
		System.out.println(firstNumber + " * " + secondNumber + " = " + operationAbstraction.multiply(firstNumber, secondNumber));
		System.out.println(firstNumber + " / " + secondNumber + " = " + operationAbstraction.divide(firstNumber, secondNumber));

		RefinedOperationAbstraction refinedOperationAbstraction = (RefinedOperationAbstraction) operationAbstraction;

		System.out.println("sqrt(" + firstNumber + ") = " + refinedOperationAbstraction.sqrt(firstNumber));
		System.out.println("pow(10, 2) = " + refinedOperationAbstraction.pow(10, 2));
		
	}

}
