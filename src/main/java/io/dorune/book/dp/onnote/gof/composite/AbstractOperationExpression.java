package io.dorune.book.dp.onnote.gof.composite;

import java.util.ArrayList;

public abstract class AbstractOperationExpression extends AbstractExpression {

	protected ArrayList<AbstractExpression> operandList = new ArrayList<AbstractExpression>();

	public final void addOperandExpression(AbstractExpression operandExpression) {
		operandList.add(operandExpression);
	}

}
