package io.dorune.book.dp.onnote.gof.interpreter.expression;

public class SubstractOperationExpression extends AbstractOperationExpression {

	public double operate() {
		AbstractExpression firstOperandExpression = operandList.get(0);
		AbstractExpression secondOperandExpression = operandList.get(1);

		double firstResult = firstOperandExpression.operate();
		double secondResult = secondOperandExpression.operate();

		return firstResult - secondResult;
	}

	@Override
	protected String getFunctionName() {
		return "SUB";
	}

}
