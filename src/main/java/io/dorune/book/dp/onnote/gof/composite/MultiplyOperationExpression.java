package io.dorune.book.dp.onnote.gof.composite;

public class MultiplyOperationExpression extends AbstractOperationExpression {

	public int operate() {
		AbstractExpression firstOperandExpression = operandList.get(0);
		AbstractExpression secondOperandExpression = operandList.get(1);

		int firstResult = firstOperandExpression.operate();
		int secondResult = secondOperandExpression.operate();

		return firstResult * secondResult;
	}

}
