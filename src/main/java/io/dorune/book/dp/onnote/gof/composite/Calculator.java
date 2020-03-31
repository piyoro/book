package io.dorune.book.dp.onnote.gof.composite;

public class Calculator {

	private AbstractExpression expression;

	public Calculator() {
		super();
	}

	public int calculate() {
		return expression.operate();
	}

	public void setExpression(AbstractExpression expression) {
		this.expression = expression;
	}
}
