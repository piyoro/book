package io.dorune.book.dp.onnote.gof.abstractfactory;



public class Client {
	
	public static void main(String[] args) throws Exception {
		
		String firstNumber = "10.3";
		String secondNumber = "20.2";
		
		AbstractOperationFactory operationFactory = new IntegerOperationFactory();
		
		AbstractOperationProduct operationProduct = operationFactory.createOperationProduct();				
		operationProduct.setFirstNumberOperandProduct(operationFactory.createNumberOperandProduct(firstNumber));
		operationProduct.setSecondNumberOperandProduct(operationFactory.createNumberOperandProduct(secondNumber));
		
		operationProduct.print();
						
		operationFactory = new DoubleOperationFactory();
		
		operationProduct = operationFactory.createOperationProduct();		
		operationProduct.setFirstNumberOperandProduct(operationFactory.createNumberOperandProduct(firstNumber));
		operationProduct.setSecondNumberOperandProduct(operationFactory.createNumberOperandProduct(secondNumber));
		
		operationProduct.print();
		
	}

}
