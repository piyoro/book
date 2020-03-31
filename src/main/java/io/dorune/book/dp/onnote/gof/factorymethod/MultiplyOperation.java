package io.dorune.book.dp.onnote.gof.factorymethod;

public class MultiplyOperation extends AbstractOperation {

	@Override
	protected AbstractOperator getOperator() {
		return new MultiplyOperator();
	}

}
