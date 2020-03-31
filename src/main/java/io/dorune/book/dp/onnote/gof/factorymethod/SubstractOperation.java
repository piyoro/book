package io.dorune.book.dp.onnote.gof.factorymethod;

public class SubstractOperation extends AbstractOperation {
	
	@Override
	protected AbstractOperator getOperator() {
		return new SubstractOperator();
	}
}
