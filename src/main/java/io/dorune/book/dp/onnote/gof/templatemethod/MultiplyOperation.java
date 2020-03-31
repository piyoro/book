package io.dorune.book.dp.onnote.gof.templatemethod;

public class MultiplyOperation extends AbstractOperation {

	protected int getAnswer(int firstNumber, int secondNumber) {
		return firstNumber * secondNumber;
	}

	@Override
	protected String getOperator() {
		return "*";
	}

}
