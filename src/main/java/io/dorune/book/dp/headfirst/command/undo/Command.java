package io.dorune.book.dp.headfirst.command.undo;

public interface Command {
	public void execute();
	public void undo();
}
