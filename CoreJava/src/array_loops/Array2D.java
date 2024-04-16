package array_loops;

public class Array2D {

	public static void main(String[] args) {
		
		int covidCasesState1[] = {431, 41313, 21, 54121};
		int covidCasesState2[] = {4310, 413130, 210, 541210};
		int covidCasesState3[] = {43100, 4131300, 2100, 5412100};
		
		System.out.println("Covid Cases State1 is: "+covidCasesState1+" and length is: "+covidCasesState1.length);
		System.out.println("Covid Cases State2 is: "+covidCasesState2+" and length is: "+covidCasesState2.length);
		System.out.println("Covid Cases State3 is: "+covidCasesState3+" and length is: "+covidCasesState3.length);
		
		// 2D Array: Array of 1D Arrays
		int[][] covidCases =
			{
				{431, 41313, 21, 54121},	// 0th index
				{4310, 413130, 210, 541210},	// 1st index
				{43100, 4131300, 2100, 5412100}	// 2nd index
			};
		System.out.println("Covid Cases is: "+covidCases+" and length is: "+covidCases.length);
		System.out.println("Covid Cases[0] is: "+covidCases[0]+" and length is: "+covidCases.length);
		System.out.println("Covid Cases[1] is: "+covidCases[1]+" and length is: "+covidCases.length);
		System.out.println("Covid Cases[2] is: "+covidCases[2]+" and length is: "+covidCases.length);
		
		System.out.println(covidCases[1][2]);
		System.out.println();
		
		//int[][] array2D = new int[5][3];
		int[][] array2D = new int[5][];
		array2D[0] = new int[3];
		array2D[1] = new int[5];
		array2D[2] = new int[7];
		array2D[3] = new int[4];
		array2D[4] = new int[2];
		
		array2D[0][0] = 1;
		array2D[2][3] = 1;
		
		for(int row=0; row<array2D.length; row++)
		{
			for(int col=0; col<array2D[row].length; col++)
			{
				System.out.print(array2D[row][col]+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// Enhanced for loop
		for(int[] array: array2D)
		{
			for(int element: array)
			{
				System.out.print(element+" ");
			}
			System.out.println();
		}

	}

}
