package io.dorune.book.dp.onnote.gof.factorymethod;

public class DivideOperator extends AbstractOperator {

	protected int getAnswer(int firstNumber, int secondNumber) {
		return firstNumber / secondNumber;
	}

	@Override
	public String getDescription() {
		return "/";
	}

}
