package io.dorune.book.dp.onnote.gof.memento;

public class OperationMemento {

	private int firstNumber;
	private int secondNumber;

	public OperationMemento(int firstNumber, int secondNumber) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
	}

	public int getFirstNumber() {
		return firstNumber;
	}

	public int getSecondNumber() {
		return secondNumber;
	}

}
