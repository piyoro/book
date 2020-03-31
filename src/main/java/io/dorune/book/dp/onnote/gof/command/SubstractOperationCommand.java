package io.dorune.book.dp.onnote.gof.command;

public class SubstractOperationCommand extends AbstractOperationCommand {

	public SubstractOperationCommand(OperationCommandReceiver receiver, int value) {
		super(receiver, value);
	}

	@Override
	public void execute() {
		receiver.substract(value);
	}

}
