
public class PrimitiveDataTypes {

	public static void main(String[] args) {
		
		/*
		 
		 Integral: byte = 8bits, short = 16bits, int = 32bits, long = 64bits
		 Floating Point: float, double = 64bits
		 Character: char = 16bits
		 Logical: boolean
		 
		 */

		byte age = 12; //Create Operation
		age = 13;      //Update Operation
		System.out.println("Age is: "+age); //Read Operation
		short number = 2000;
		System.out.println("Number is: "+number);
		int numberOfTrees = 543314;
		System.out.println("Number of Trees are: "+numberOfTrees);
		long phoneNumber = 9999933333L; //need to add "L" or "l" for large data
		System.out.println("Phone Number is: "+phoneNumber);
		
		double taxes = 0.18;
		System.out.println("Taxes applied: "+taxes);
		float amount = 2100.25F;  //need to add "F" or "f" for large data
		System.out.println("Amount is: "+amount);
		
		char ch = 'A';
		ch = 67;
		System.out.println("ch is: "+ch);
		ch ='\u20b9';
		System.out.println("ch now is: "+ch);
		
		
		boolean isInternetOn = true;
		System.out.println("Is Internet On: "+isInternetOn);
		boolean canIBookCab = false;
		System.out.println("Can I Book Cab: "+canIBookCab);
		
		
	
		
	}

}
