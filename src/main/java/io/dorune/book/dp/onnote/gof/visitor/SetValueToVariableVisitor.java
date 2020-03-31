package io.dorune.book.dp.onnote.gof.visitor;

import com.bsb.calc.visitor.expression.AbstractExpression;
import com.bsb.calc.visitor.expression.VariableExpression;

public class SetValueToVariableVisitor extends AbstractVisitor {

	private String variableName;
	private int value;

	public SetValueToVariableVisitor(String variableName, int value) {
		this.variableName = variableName;
		this.value = value;
	}

	@Override
	public void visit(AbstractExpression expression) {
		VariableExpression variableExpression = (VariableExpression) expression;
		
		if (variableExpression.getName().equals(variableName)) {
			variableExpression.setValue(value);
		}
	}

}
