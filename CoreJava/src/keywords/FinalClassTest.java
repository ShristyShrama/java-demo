package keywords;

//Final class declaration
final class FinalClassExample 
{
	 public void displayMessage() 
	 {
	     System.out.println("This is a final class example");
	 }
}
	
	//Attempting to extend a final class will result in a compilation error
	//Uncommenting the code below will result in a compilation error
	//class SubClass extends FinalClassExample 
	//{
	//  // Trying to extend a final class
	//}

public class FinalClassTest 
{
	public static void main(String[] args)
	{
		 FinalClassExample finalObj = new FinalClassExample();
	     finalObj.displayMessage();
	}
}
