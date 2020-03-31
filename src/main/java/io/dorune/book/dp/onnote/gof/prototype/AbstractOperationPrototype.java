package io.dorune.book.dp.onnote.gof.prototype;

public abstract class AbstractOperationPrototype {

	private int firstNumber;
	private int secondNumber;

	public AbstractOperationPrototype() {
		super();
	}

	public AbstractOperationPrototype(AbstractOperationPrototype operationPrototype) {
		this.firstNumber = operationPrototype.firstNumber;
		this.secondNumber = operationPrototype.secondNumber;
	}

	public abstract AbstractOperationPrototype getClone();

	public int getFirstNumber() {
		return firstNumber;
	}

	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}

	public int getSecondNumber() {
		return secondNumber;
	}

	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}

	protected final void print(String result) {
		System.out.println(result);
	}

	protected abstract int getAnswer(int firstNumber, int secondNumber);

	protected abstract String getOperator();

	public final void operate() {
		int firstNumber = getFirstNumber();
		int secondNumber = getSecondNumber();

		String operator = getOperator();

		int answer = getAnswer(firstNumber, secondNumber);

		String result = firstNumber + operator + secondNumber + " = " + answer;

		print(result);
	}

}
