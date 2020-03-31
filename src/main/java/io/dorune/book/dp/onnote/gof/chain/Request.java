package io.dorune.book.dp.onnote.gof.chain;

public final class Request {

	private String expression;

	public Request(String expression) {
		this.expression = expression;
	}

	public String getExpression() {
		return expression;
	}

	public int getFirstNumber(String operator) {
		int operatorIndex = expression.indexOf(operator);
		
		String firstNumber = expression.substring(0, operatorIndex);
		return Integer.parseInt(firstNumber);
	}

	public int getSecondNumber(String operator) {
		int operatorIndex = expression.indexOf(operator);
		
		String secondNumber = expression.substring(operatorIndex + 1);
		return Integer.parseInt(secondNumber);
	}

}
