package io.dorune.book.dp.onnote.gof.factorymethod;

public abstract class AbstractOperator {

	protected abstract int getAnswer(int firstNumber, int secondNumber);

	public abstract String getDescription();

}
