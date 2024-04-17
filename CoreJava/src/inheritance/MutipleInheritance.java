package inheritance;

//First interface
interface One
{
	void methodA(); //Can't specify the body here
}

//Second interface
interface Two
{
	void methodB();
}

//Class implementing both interfaces
class MyClass implements One, Two
{
	public void methodA()
	{
		System.out.println("Inside methodA");
	}
	
	public void methodB()
	{
		System.out.println("Inside methodB");
	}
	
	public void myMethod()
	{
		System.out.println("Inside myMethod");
	}
}

public class MutipleInheritance
{
	public static void main(String[] args)
	{
		MyClass obj = new MyClass();
		obj.methodA();
		obj.methodB();
		obj.myMethod();
	}

}
