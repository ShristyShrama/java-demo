package polymorphism;

public class MethodOverloading_DataTypes
{
	static int add(int a, int b)
	{
		return a+b;
	}
	
	static double add(double a, double b)
	{
		return a+b;
	}

	public static void main(String[] args)
	{
		System.out.println(add(11,11));
		System.out.println(add(11.2,11.2));
	}

}
