package io.dorune.book.dp.onnote.gof.prototype;

public class DivideOperationPrototype extends AbstractOperationPrototype {

	public DivideOperationPrototype() {
		super();
	}

	public DivideOperationPrototype(AbstractOperationPrototype operationPrototype) {
		super(operationPrototype);
	}

	@Override
	public AbstractOperationPrototype getClone() {
		return new DivideOperationPrototype(this);
	}

	@Override
	protected int getAnswer(int firstNumber, int secondNumber) {
		return firstNumber / secondNumber;
	}

	@Override
	protected String getOperator() {
		return "/";
	}

}
