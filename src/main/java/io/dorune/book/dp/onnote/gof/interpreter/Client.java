package io.dorune.book.dp.onnote.gof.interpreter;

import com.bsb.calc.interpreter.expression.AbstractExpression;
import com.bsb.calc.interpreter.expression.CalcExpressionFactory;

public class Client {

	public static void main(String[] args) {
		String text = "ADD(2,10)";
		
		CalcContext calcContext = new CalcContext(text);

		try {
			
			double result = 0;
			
			CalcToken currentToken = calcContext.getCurrentTokenAndGoToNext();

			AbstractExpression expression = CalcExpressionFactory.createExpression(currentToken);
			if (expression != null) {
				expression.parse(calcContext);

				result = expression.operate();
			}

			System.out.println(text + " = " + result);

		} catch (CalcParseException e) {

			e.printStackTrace();
		}		
	}

}
