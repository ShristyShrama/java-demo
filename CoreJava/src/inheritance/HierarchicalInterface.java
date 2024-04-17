package inheritance;

class Animal
{
	void eat()
	{
		System.out.println("Animal eating...");
	}
}

class Tiger extends Animal
{
	void growl()
	{
		System.out.println("Tiger growling...");
	}
}

class Dog extends Animal
{
	void bark()
	{
		System.out.println("Dog barking...");
	}
}

public class HierarchicalInterface
{

	public static void main(String[] args)
	{
		Dog obj1 = new Dog();
		obj1.bark();
		obj1.eat();
		
		Tiger obj2 = new Tiger();
		obj2.growl();
		obj2.eat();

	}

}
