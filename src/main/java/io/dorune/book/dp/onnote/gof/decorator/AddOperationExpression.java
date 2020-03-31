package io.dorune.book.dp.onnote.gof.decorator;

public class AddOperationExpression extends AbstractOperationExpression {

	public double operate() {
		AbstractExpression firstOperandExpression = operandList.get(0);
		AbstractExpression secondOperandExpression = operandList.get(1);

		double firstResult = firstOperandExpression.operate();
		double secondResult = secondOperandExpression.operate();

		return firstResult + secondResult;
	}

}
