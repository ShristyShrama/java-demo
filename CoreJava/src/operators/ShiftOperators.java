package operators;

public class ShiftOperators {

	public static void main(String[] args) {
		
		//>>, <<, >>>
		
		int num1 = 8;	
		int num2 = 10;
		
		int result1 = num1 >> 3;	//divide 8 by 2 power 3 -> -> 1
		int result2 = num2 >> 2;
		
		System.out.println("Result1 is: "+result1);
		System.out.println("Result2 is: "+result2);
		
		int result3 = num1 << 3;	
		int result4 = num2 << 2;
		
		System.out.println("Result3 is: "+result3);
		System.out.println("Result4 is: "+result4);

	}

}
