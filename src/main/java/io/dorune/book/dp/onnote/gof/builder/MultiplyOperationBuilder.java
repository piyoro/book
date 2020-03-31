package io.dorune.book.dp.onnote.gof.builder;

public class MultiplyOperationBuilder extends AbstractOperationBuilder {

	public MultiplyOperationBuilder(int firstNumber, int secondNumber) {
		super(firstNumber, secondNumber);
	}

	public int operate(int firstNumber, int secondNumber) {
		return firstNumber * secondNumber;
	}

	@Override
	public void buildOperator() {
		result.append(" * ");
	}

}
