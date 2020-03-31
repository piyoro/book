package io.dorune.book.dp.onnote.gof.interpreter.expression.decorator;

import com.bsb.calc.interpreter.expression.AbstractExpression;

public class FracDecoratorExpression extends AbstractDecoratorExpression{
	
	public FracDecoratorExpression(){
		super();
	}
	
	public FracDecoratorExpression(AbstractExpression expression){
		super(expression);
	}
	
	public double operate(){				
		return 1 / expression.operate();
	}

	@Override
	protected String getFunctionName() {
		return "FRAC";
	}
	
}
