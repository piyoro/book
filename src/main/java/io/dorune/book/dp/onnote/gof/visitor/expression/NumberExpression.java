package io.dorune.book.dp.onnote.gof.visitor.expression;


public class NumberExpression extends AbstractExpression {

	private int value;

	public NumberExpression(int value) {
		this.value = value;
	}

	public int operate() {
		return this.value;
	}

}
