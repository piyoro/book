package io.dorune.book.dp.onnote.gof.mediator;

public interface IColleague {

	public void setMediator(IMediator mediator);

	public abstract void printAnswer(int answer);
	
	public abstract int getFirstNumber();

	public abstract int getSecondeNumber();

}
