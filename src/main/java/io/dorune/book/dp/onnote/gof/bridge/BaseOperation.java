package io.dorune.book.dp.onnote.gof.bridge;

public class BaseOperation implements IBaseOperationImplementor {

	@Override
	public int add(int firstNumber, int secondNumber) {
		return firstNumber + secondNumber;
	}

	@Override
	public int substract(int firstNumber, int secondNumber) {
		return firstNumber - secondNumber;
	}

	@Override
	public int multiply(int firstNumber, int secondNumber) {
		return firstNumber * secondNumber;
	}

	@Override
	public int divide(int firstNumber, int secondNumber) {
		return firstNumber / secondNumber;
	}

}
