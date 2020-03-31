package io.dorune.book.dp.onnote.gof.factorymethod;

public class DivideOperation extends AbstractOperation {

	@Override
	protected AbstractOperator getOperator() {
		return new DivideOperator();
	}

}
