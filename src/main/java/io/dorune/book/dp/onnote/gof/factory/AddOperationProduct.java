package io.dorune.book.dp.onnote.gof.factory;

public class AddOperationProduct extends AbstractOperationProduct{
	
	public void operate(int firstNumber, int secondNumber){
		
		int answer = firstNumber + secondNumber;
		
		System.out.println(firstNumber + " + " + secondNumber + " = " +  answer);
	}
	
}
