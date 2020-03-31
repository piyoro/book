package io.dorune.book.dp.onnote.gof.templatemethod;

public class Client {

	public static void main(String[] args) {

		int firstNumber = 100;
		int secondNumber = 20;

		AbstractOperation[] operations = { new AddOperation(),
				new SubstractOperation(), new MultiplyOperation(),
				new DivideOperation() };

		for (int i = 0; i < operations.length; i++) {
			operations[i].setFirstNumber(firstNumber);
			operations[i].setSecondNumber(secondNumber);

			operations[i].operate();
		}

	}

}
