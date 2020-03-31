package io.dorune.book.dp.onnote.gof.visitor;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import com.bsb.calc.visitor.expression.AbstractExpression;



public class Calculator {

	private AbstractExpression expression;

	private HashMap<String, Integer> variableToValueMap = new HashMap<String, Integer>();

	public Calculator() {
		super();
	}

	public int calculate() {
		if (expression != null) {

			Set<String> keySet = variableToValueMap.keySet();

			Iterator<String> it = keySet.iterator();
			String variableName = null;
			Integer value = null;
			while (it.hasNext()) {
				variableName = it.next();
				value = variableToValueMap.get(variableName);

				SetValueToVariableVisitor setValueToVariableVisitor = new SetValueToVariableVisitor(variableName, value);

				expression.accept(setValueToVariableVisitor);
			}

			return expression.operate();
		}
		
		return 0;
	}

	public void setExpression(AbstractExpression expression) {
		this.expression = expression;
	}

	public void addVariableToValue(String variableName, int value) {
		variableToValueMap.put(variableName, value);
	}

}
