package operators;

public class TernaryOperators {

	public static void main(String[] args) {
		
		int eWallet = 400;
		int cabFare = 500;
		
		int amountToPay = (eWallet > cabFare) ? cabFare-50 : (cabFare-eWallet) + 10;
		System.out.println("Amount To Pay is: "+amountToPay);

	}

}
