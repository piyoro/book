package io.dorune.book.dp.onnote.gof.interpreter.expression.decorator;

import com.bsb.calc.interpreter.expression.AbstractExpression;



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

	@Override
	protected String getFunctionName() {
		return "SQRT";
	}
	
}
