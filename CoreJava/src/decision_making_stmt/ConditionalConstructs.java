package decision_making_stmt;
import java.util.Scanner;

public class ConditionalConstructs {

	public static void main(String[] args) {

		/*
		 promo code -> 1001
		 for amount greater than 200, discount of 50% off
		 
		 promo code -> 2001
		 for amount > 300, upto 200 max off, discount of 40% 
		 */
		
		Scanner scanner = new Scanner(System.in); // input stream
		System.out.println("Enter a Promo Code");
		int promocode = scanner.nextInt();// to read an integer from scanner
		
		System.out.println("Enter the Amount");
		double amount = scanner.nextDouble();
		
		scanner.close(); // release the memory resources
		
		double discount = 0;
		
		if(promocode == 1001)
		{
			System.out.println("You are eligible for discount");
			if (amount > 200)
			{
				System.out.println("Promo Code Applied and You will get 50% off");
				discount = 0.50 * amount;
				System.out.println("Discount is: "+discount);
			}
			else
			{
				System.out.println("Amount is lesser. Please add items worth "+(201-amount)+ "more");
			}
		}
		else if(promocode == 2001) 
			{
				if (amount > 300) 
				{
					System.out.println("Promo Code Applied and You will get 40% off But upto 200");
					discount = 0.40 * amount;
					System.out.println("Discount is: "+discount);
				}
				else
				{
					System.out.println("Amount is lesser. Please add items worth "+(301-amount)+" more");
				}
			}
		else 
		{
			System.out.println("You are not eligible for discount");
		}

	}

}
