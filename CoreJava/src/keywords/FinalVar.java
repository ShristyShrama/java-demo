package keywords;

public class FinalVar 
{
	// Declaring a final variable
    final int MAX_VALUE = 100;

	public static void main(String[] args)
	{
		FinalVar obj = new FinalVar();
        
        // Attempting to change the value of the final variable will result in a compilation error
		// obj.MAX_VALUE = 200; // This line will cause a compilation error
        
        System.out.println("Maximum value: " + obj.MAX_VALUE);

	}

}
