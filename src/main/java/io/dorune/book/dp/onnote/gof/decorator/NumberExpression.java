package io.dorune.book.dp.onnote.gof.decorator;


public class NumberExpression extends AbstractExpression {

	private int value;

	public NumberExpression(int value) {
		this.value = value;
	}

	public double operate() {
		return value;
	}

}
