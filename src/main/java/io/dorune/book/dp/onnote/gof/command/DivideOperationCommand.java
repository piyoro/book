package io.dorune.book.dp.onnote.gof.command;

public class DivideOperationCommand extends AbstractOperationCommand {

	public DivideOperationCommand(OperationCommandReceiver receiver, int value) {
		super(receiver, value);
	}

	@Override
	public void execute() {
		receiver.divide(value);
	}

}
