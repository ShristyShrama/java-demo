package polymorphism;

class Vehicle
{
	void run()
	{
		System.out.println("Vehicle is moving");
	}
}

public class MethodOverriding extends Vehicle
{
	void run()
	{
		System.out.println("Car is moving");
	}
	
	public static void main(String[] args)
	{
		MethodOverriding obj = new MethodOverriding();
		obj.run();

	}

}
