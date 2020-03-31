package io.dorune.book.dp.onnote.gof.prototype;

public class MultiplyOperationPrototype extends AbstractOperationPrototype {

	public MultiplyOperationPrototype() {
		super();
	}

	public MultiplyOperationPrototype(AbstractOperationPrototype operationPrototype) {
		super(operationPrototype);
	}

	@Override
	public AbstractOperationPrototype getClone() {
		return new MultiplyOperationPrototype(this);
	}

	@Override
	protected int getAnswer(int firstNumber, int secondNumber) {
		return firstNumber * secondNumber;
	}

	@Override
	protected String getOperator() {
		return "*";
	}

}
