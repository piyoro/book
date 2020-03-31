package io.dorune.book.dp.onnote.gof.mediator;

public interface IMediator {

	public abstract void createColleagues();

	public abstract void colleagueChanged(IColleague colleague);
}
