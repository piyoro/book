package io.dorune.book.dp.onnote.gof.interpreter.expression.decorator;

import com.bsb.calc.interpreter.CalcContext;
import com.bsb.calc.interpreter.CalcParseException;
import com.bsb.calc.interpreter.CalcToken;
import com.bsb.calc.interpreter.expression.AbstractExpression;
import com.bsb.calc.interpreter.expression.AbstractFunctionExpression;
import com.bsb.calc.interpreter.expression.CalcExpressionFactory;

public abstract class AbstractDecoratorExpression extends AbstractFunctionExpression{
	
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
	
	@Override
	public final void parse(CalcContext context) throws CalcParseException {
		context.skipToken(getFunctionName());
		
		context.getCurrentTokenAndGoToNext();
		
		context.skipToken("(");
					
		CalcToken currentToken = context.getCurrentTokenAndGoToNext();
		
		AbstractExpression expression = CalcExpressionFactory.createExpression(currentToken);
		expression.parse(context);
				
		setExpression(expression);	
				
		context.getCurrentTokenAndGoToNext();
		context.skipToken(")");
	}

}
