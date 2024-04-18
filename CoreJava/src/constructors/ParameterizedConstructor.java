package constructors;

public class ParameterizedConstructor
{
	int num;
	String color;
	
	// Creating a parameterized constructor
	ParameterizedConstructor(int i, String c)
	{
		num = i;
		color = c;
		
		// System.out.println(num+" "+color);
	}
	
	// Method to display values
	void display()
	{
		System.out.println(num+" "+color);
	}

	public static void main(String[] args)
	{
		// Creating objects & passing values
		ParameterizedConstructor obj1 = new ParameterizedConstructor(111,"Black");
		ParameterizedConstructor obj2 = new ParameterizedConstructor(222,"Dusty");
		obj1.display();
		obj2.display();
	}

}
