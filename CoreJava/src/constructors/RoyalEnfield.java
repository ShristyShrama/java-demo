package constructors;

// Example of Constructor Overloading

public class RoyalEnfield
{
	int num;
	String color;
	int speed;
	
	// Creating a two argument constructor
	RoyalEnfield(int i, String c)
	{
		num = i;
		color = c;
	}
	
	// Creating a three argument constructor
	RoyalEnfield(int i, String c, int s)
	{
		num = i;
		color = c;
		speed = s;
	}
	
	// Method to display the values
	void display()
	{
		System.out.println(num+" "+color+" "+speed);
	}
	
	public static void main(String[] args)
	{
		// Cresting objects and passing values
		RoyalEnfield obj1 = new RoyalEnfield(111, "Black");
		RoyalEnfield obj2 = new RoyalEnfield(222, "Dusty", 120);

		// Calling method to display the values of object
		obj1.display();
		obj2.display();
	}

}
