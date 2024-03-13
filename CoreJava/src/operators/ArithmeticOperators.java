package operators;

public class ArithmeticOperators {

	public static void main(String[] args) {
		
		// +, -, *, /, %
		
		double amount = 2000;
		double taxes = 0.18;
		double finalamount = amount + (amount*taxes);
		System.out.println("Final Amount is: "+finalamount);
		
		int num1 = 10;
		int num2 = 3;
		int result = num1 % num2;
		System.out.println("Remender is: "+result);
		
		

	}

}
