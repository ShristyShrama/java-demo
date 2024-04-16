package array_loops;

public class Array1D {

	public static void main(String[] args) {
		
		int confirmedCases = 431;
		int recoveredCases = 41313;
		int deceasedCases = 21;
		int vaccinatedCases = 54121;
		
		int covidCases[] = {431, 41313, 21, 54121};
		int array1[] = {10, 20, 30, 40, 50};
		int[] array2 = {10, 20, 30, 40, 50};
		
		System.out.println("covidCases is: "+covidCases); // it will display the hashcode values not the actual values of array
		System.out.println("array1 is: "+array1);
		System.out.println("array2 is: "+array2);
		
		covidCases[0] += 13; // update the 0th index value by adding 13 into it
		System.out.println("covidCases[0] is: "+covidCases[0]);
		System.out.println("covidCases[1] is: "+covidCases[1]);
		System.out.println("covidCases[2] is: "+covidCases[2]);
		System.out.println("covidCases[3] is: "+covidCases[3]);
		
		//difference b/w before & after bracket
		int a1[], a2; // here only a1 is array
		a1 = new int[5];
		a2 = 10;
		
		int[] a3, a4; // here a3 & a4 both are array
		a3 = new int[10];
		a4 = new int[20];
		
		System.out.println("a1[2] is: "+a1[2]); // default value will be 0
		System.out.println();
		
		// for loop -- to print elements of array
		for(int idx=0; idx<covidCases.length; idx++)
		{
			System.out.println("[FOR] covidCases["+idx+"] is: "+covidCases[idx]);
		}
		
		System.out.println();
		System.out.println("Iterating using enhanced for loop");
		for(int element: covidCases)
		{
			System.out.println(element);
		}
		
		

	}

}
