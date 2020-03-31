package io.dorune.book.dp.onnote.gof.strategy;

public class Client {

	public static void main(String[] args) throws Exception {

		OperationContext operationContext = new OperationContext();

		int firstNumber = 100;
		int secondNumber = 20;

		AbstractOperationStrategy[] operationStrategies = {
				new AddOperationStrategy(), new SubstractOperationStrategy(),
				new MultiplyOperationStrategy(), new DivideOperationStrategy() };

		for (int i = 0; i < operationStrategies.length; i++) {
			operationContext.setOperationStrategy(operationStrategies[i]);
			operationContext.operate(firstNumber, secondNumber);
		}

	}

}
