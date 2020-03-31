package io.dorune.book.dp.onnote.gof.abstractfactory;

public abstract class AbstractNumberOperandProduct {
	
	private String value;
	
	public AbstractNumberOperandProduct(String value) {
		this.value = value;
	}
	
	public abstract double getNumber();

	protected final String getValue() {
		return value;
	}
}
