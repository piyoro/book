package io.dorune.book.dp.onnote.gof.state;

public interface IState {

	public void action(IContext context, String actionCommand);

}
