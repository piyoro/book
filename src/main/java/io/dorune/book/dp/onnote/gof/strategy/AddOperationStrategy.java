package io.dorune.book.dp.onnote.gof.strategy;

public class AddOperationStrategy extends AbstractOperationStrategy {

	public int getAnswer(int firstNumber, int secondNumber) {
		return firstNumber + secondNumber;
	}

	@Override
	public String getOperator() {
		return "+";
	}

}
