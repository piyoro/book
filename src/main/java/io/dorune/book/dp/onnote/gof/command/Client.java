package io.dorune.book.dp.onnote.gof.command;

public class Client {

	public static void main(String[] args) {

		OperationCommandReceiver receiver = new OperationCommandReceiver();
		
		int result = receiver.getResult();
		
		System.out.println("result = " + result);

		AddOperationCommand addCommand = new AddOperationCommand(receiver, 20);
		addCommand.execute();

		result = receiver.getResult();
		System.out.println("result + 20 = " + result);

		SubstractOperationCommand substractCommand = new SubstractOperationCommand(receiver, 10);
		substractCommand.execute();

		result = receiver.getResult();
		System.out.println("result - 10 = " + result);

		MultiplyOperationCommand multiplyCommand = new MultiplyOperationCommand(receiver, 10);
		multiplyCommand.execute();

		result = receiver.getResult();
		System.out.println("result * 10 = " + result);

		DivideOperationCommand divideCommand = new DivideOperationCommand(receiver, 10);
		divideCommand.execute();

		result = receiver.getResult();
		System.out.println("result / 10 = " + result);

	}

}
