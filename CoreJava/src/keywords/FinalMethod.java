package keywords;

class Parent 
{
    // Final method in the Parent class
    public final void displayMessage() 
    {
        System.out.println("This is a final method in the Parent class");
    }
}

public class FinalMethod extends Parent
{
	// Attempting to override the final method will result in a compilation error
    // Uncommenting the method below will result in a compilation error
	// public void displayMessage() 
	// {
	//    System.out.println("Trying to override the final method in the Child class");
	// }
	

    public static void main(String[] args) 
	{
        FinalMethod obj = new FinalMethod();
        obj.displayMessage(); // Calling the final method from the Parent class
    }
}
