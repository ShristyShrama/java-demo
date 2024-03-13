package operators;
import java.util.Scanner;

public class RelationalOperators {

	public static void main(String[] args) {
		
		//>, <, >=, <=, ==, !=
		
		int eWallet = 500;
		int cabFare = 700;
		boolean result = eWallet >= cabFare;
		System.out.println("Can I book a cab? "+result);
		
		int promoCode = 100023;
		Scanner sc = new Scanner(System.in); //scanner is input stream to read the data entered by user 
		System.out.println("Enter the promocode: ");
		int code = sc.nextInt();
		sc.close();
		System.out.println("Is the promocode valid? "+(code == promoCode));
	}

}
