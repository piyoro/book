package io.dorune.book.dp.onnote.gof.decorator;

import com.bsb.calc.decorator.AbstractExpression;



public abstract class AbstractDecoratorExpression extends AbstractExpression{
	
	protected AbstractExpression expression;
	
	protected AbstractDecoratorExpression(){
		super();
	}
	
	public AbstractDecoratorExpression(AbstractExpression expression){
		this.expression = expression;
	}

	public void setExpression(AbstractExpression expression) {
		this.expression = expression;
	}

}
