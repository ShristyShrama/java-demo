package polymorphism;

class Car
{
	void run()
	{
		System.out.println("running ");
	}
}

public class DynamicMethodDispatch extends Car
{
	void run()
	{
		System.out.println("running offroad");
	}

	public static void main(String[] args) 
	{
		Car obj = new DynamicMethodDispatch();
		obj.run();
	}

}
