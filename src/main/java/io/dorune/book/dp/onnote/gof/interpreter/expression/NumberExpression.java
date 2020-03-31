package io.dorune.book.dp.onnote.gof.interpreter.expression;

import com.bsb.calc.interpreter.CalcContext;
import com.bsb.calc.interpreter.CalcParseException;

public class NumberExpression extends AbstractExpression {

	private int value;

	public NumberExpression(int value) {
		this.value = value;
	}

	public double operate() {
		return this.value;
	}

	@Override
	public void parse(CalcContext context) throws CalcParseException {

	}

}
