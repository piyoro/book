package io.dorune.book.dp.onnote.gof.observer;

import java.util.ArrayList;

public class OperationSubject implements ISubject {

	private int firstNumber;
	private int secondNumber;

	private ArrayList<AbstractOperationObserver> observers = new ArrayList<AbstractOperationObserver>();

	public OperationSubject() {
		super();
	}

	public void registerObserver(AbstractOperationObserver oberver) {
		observers.add(oberver);
	}

	public void removeObserver(AbstractOperationObserver oberver) {
		int index = observers.indexOf(oberver);
		if (index >= 0) {
			observers.remove(index);
		}
	}

	public void notifyObservers() {
		AbstractOperationObserver oberver = null;
		for (int i = 0; i < observers.size(); i++) {
			oberver = observers.get(i);
			oberver.update();
		}
	}

	public int getFirstNumber() {
		return firstNumber;
	}

	public void setNumber(int firstNumber, int secondNumber) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;

		notifyObservers();
	}

	public int getSecondNumber() {
		return secondNumber;
	}

}
