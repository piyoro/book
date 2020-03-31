package io.dorune.book.dp.onnote.gof.decorator;

import com.bsb.calc.decorator.AbstractExpression;





public class SqrtDecoratorExpression extends AbstractDecoratorExpression{
	
	public SqrtDecoratorExpression(){
		super();
	}
	
	public SqrtDecoratorExpression(AbstractExpression expression){
		super(expression);
	}
	
	public double operate(){		
		return Math.sqrt(expression.operate());
	}
	
}
