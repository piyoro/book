package io.dorune.book.dp.onnote.gof.proxy;

public abstract class AbstractOperationSubject {

	public abstract int operate(int firstNumber, int secondNumber) throws OperationException;

}
