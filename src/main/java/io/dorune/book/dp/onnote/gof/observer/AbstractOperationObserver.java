package io.dorune.book.dp.onnote.gof.observer;

public abstract class AbstractOperationObserver {

	private OperationSubject operationSubject;

	public AbstractOperationObserver(OperationSubject operationSubject) {
		this.operationSubject = operationSubject;
	}

	public abstract void update();

	protected final int getFirstNumber() {
		return operationSubject.getFirstNumber();
	}

	protected final int getSecondNumber() {
		return operationSubject.getSecondNumber();
	}
}
