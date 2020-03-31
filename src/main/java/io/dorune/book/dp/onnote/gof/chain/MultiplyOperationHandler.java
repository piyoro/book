package io.dorune.book.dp.onnote.gof.chain;

public class MultiplyOperationHandler extends AbstractOperationHandler {

	public MultiplyOperationHandler(String operator) {
		super(operator);
	}

	@Override
	protected int operate(Request request) {
		String operator = getOperator();

		int firstNumber = request.getFirstNumber(operator);
		int secondNumber = request.getSecondNumber(operator);

		return firstNumber * secondNumber;
	}

}
