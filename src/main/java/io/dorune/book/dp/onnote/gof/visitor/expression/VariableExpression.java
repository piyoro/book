package io.dorune.book.dp.onnote.gof.visitor.expression;

import com.bsb.calc.visitor.AbstractVisitor;

public class VariableExpression extends AbstractExpression {

	private String name;
	private int value;

	public VariableExpression(String name) {
		this.name = name;
	}

	public int operate() {
		return this.value;
	}

	@Override
	public void accept(AbstractVisitor v) {
		v.visit(this);
	}

	public String getName() {
		return name;
	}

	public void setValue(int value) {
		this.value = value;
	}

}
