package io.dorune.book.dp.onnote.gof.interpreter.expression.decorator;

import com.bsb.calc.interpreter.expression.AbstractExpression;

public class PowDecoratorExpression extends AbstractDecoratorExpression{
	
	private double exponent = 2;
	
	public PowDecoratorExpression(){
		super();
	}
	
	public PowDecoratorExpression(AbstractExpression expression, double exponent){
		super(expression);
		
		this.exponent = exponent;
	}
	
	public double operate(){		
		
		//System.out.println(this.getClass() + " operate expression = " + expression + " exponent = " + exponent);
		
		return Math.pow(expression.operate(), exponent);
	}

	@Override
	protected String getFunctionName() {
		return "POW";
	}
	
}
