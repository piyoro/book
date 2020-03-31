package io.dorune.book.dp.onnote.gof.command;

public class OperationCommandReceiver {

	private int result;

	public int getResult() {
		return result;
	}

	public void add(int value) {
		result += value;
	}

	public void substract(int value) {
		result -= value;
	}

	public void multiply(int value) {
		result *= value;
	}

	public void divide(int value) {
		result /= value;
	}

}
