package io.dorune.book.dp.onnote.gof.visitor.expression;

import java.util.ArrayList;

import com.bsb.calc.visitor.AbstractVisitor;

public abstract class AbstractOperationExpression extends AbstractExpression {

	protected ArrayList<AbstractExpression> operandList = new ArrayList<AbstractExpression>();

	public final void addOperandExpression(AbstractExpression operandExpression) {
		operandList.add(operandExpression);
	}

	@Override
	public final void accept(AbstractVisitor v) {
		AbstractExpression operandExpression = null;
		for (int i = 0; i < operandList.size(); i++) {
			operandExpression = operandList.get(i);

			operandExpression.accept(v);
		}
	}

}
