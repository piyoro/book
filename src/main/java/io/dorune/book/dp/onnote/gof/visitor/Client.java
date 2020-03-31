package io.dorune.book.dp.onnote.gof.visitor;

import com.bsb.calc.visitor.expression.AddOperationExpression;
import com.bsb.calc.visitor.expression.NumberExpression;
import com.bsb.calc.visitor.expression.VariableExpression;

public class Client {

	public static void main(String[] args) {

		Calculator calculator = new Calculator();

		int firstNumber = 100;		
		NumberExpression firstNumberEquation = new NumberExpression(firstNumber);

		VariableExpression secondNumberEquation = new VariableExpression("ABC");
		
		AddOperationExpression addOperationExpression = new AddOperationExpression();
		addOperationExpression.addOperandExpression(firstNumberEquation);
		addOperationExpression.addOperandExpression(secondNumberEquation);
		
		calculator.setExpression(addOperationExpression);
		
		String variableName = "ABC";
		int value = 80;
		
		System.out.println("ABC = " + value);

		calculator.addVariableToValue(variableName, value);
				
		System.out.println("100 + ABC = " + calculator.calculate());
		
	}

}
