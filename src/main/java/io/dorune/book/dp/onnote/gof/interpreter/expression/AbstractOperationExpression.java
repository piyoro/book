package io.dorune.book.dp.onnote.gof.interpreter.expression;

import java.util.ArrayList;

import com.bsb.calc.interpreter.CalcContext;
import com.bsb.calc.interpreter.CalcParseException;
import com.bsb.calc.interpreter.CalcToken;

public abstract class AbstractOperationExpression extends AbstractFunctionExpression {

	protected ArrayList<AbstractExpression> operandList = new ArrayList<AbstractExpression>();

	public abstract double operate();

	public final void addOperandExpression(AbstractExpression operandExpression) {
		operandList.add(operandExpression);
	}	

	@Override
	public final void parse(CalcContext context) throws CalcParseException {
		context.skipToken(getFunctionName());

		context.getCurrentTokenAndGoToNext();
		context.skipToken("(");

		CalcToken currentToken = context.getCurrentTokenAndGoToNext();

		AbstractExpression operandExpression = CalcExpressionFactory.createExpression(currentToken);
		operandExpression.parse(context);

		addOperandExpression(operandExpression);

		context.getCurrentTokenAndGoToNext();
		context.skipToken(",");

		currentToken = context.getCurrentTokenAndGoToNext();

		operandExpression = CalcExpressionFactory.createExpression(currentToken);
		operandExpression.parse(context);

		addOperandExpression(operandExpression);

		context.getCurrentTokenAndGoToNext();
		context.skipToken(")");
	}

}
