package operators;

public class BitwiseOperators {

	public static void main(String[] args) {
		
		//&, |, ^
		
		int num1 = 8;		//1 0 0 0
		int num2 = 10;      //1 0 1 0
		
		int result1 = num1 & num2;		//1 0 0 0 -> 8
		int result2 = num1 | num2;      //1 0 1 0 -> 10
		int result3 = num1 ^ num2;      //0 0 1 0 -> 2
		
		System.out.println("Result1 is: "+result1);
		System.out.println("Result2 is: "+result2);
		System.out.println("Result3 is: "+result3);
		

	}

}
