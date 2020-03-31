package io.dorune.book.dp.onnote.gof.abstractfactory;

public abstract class AbstractOperationFactory {

	public abstract AbstractOperationProduct createOperationProduct();
	
	public abstract AbstractNumberOperandProduct createNumberOperandProduct(String value);
	
}
