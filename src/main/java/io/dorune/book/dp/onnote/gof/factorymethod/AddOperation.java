package io.dorune.book.dp.onnote.gof.factorymethod;

public class AddOperation extends AbstractOperation {

	@Override
	protected AbstractOperator getOperator() {
		return new AddOperator();
	}

}
