package operators;

public class AssignmentOperators {

	public static void main(String[] args) {
		
		// =, +=, -=, *=, /=, %=
		
		int amount = 100;
		System.out.println("Final Amount is: "+amount);
		
		amount += 50; // it is similar to amount = amount + 50
		System.out.println("After adding amount is: "+amount);
		
		amount -= 50; // it is similar to amount = amount - 50
		System.out.println("After subtracting amount is: "+amount);
		
		amount %= 7; // it is similar to amount = amount + 50
		System.out.println("Remender is: "+amount);
		
		

	}

}
