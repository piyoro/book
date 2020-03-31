package io.dorune.book.dp.onnote.gof.state;

public interface IContext {

	public abstract void changeState(IState state);

	public abstract void updateDisplay(String text);

	public abstract void appendInputToDisplay(String input);

	public abstract boolean isOperator(String actionCommand);

	public abstract void calculate();

	public abstract void setLastOperator(String lastCommand);

}
