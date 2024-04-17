package inheritance;

class A
{
	void msgA()
	{
		System.out.println("This is class A");
	}
}

class B extends A
{
	void msgB()
	{
		System.out.println("This is class B");
	}
}

public class SingleInheritance
{
	public static void main(String[] args)
	{
		B obj = new B();
		obj.msgA();
		obj.msgB();
	}

}
