package inheritance;

class Mammal
{
	void eat()
	{
		System.out.println("eating...");
	}
}

class Loin extends Mammal
{
	void growl()
	{
		System.out.println("growling...");
	}
}

class Cub extends Loin
{
	void weep()
	{
		System.out.println("weeping...");
	}
}

public class MutilevelInheritance
{
	public static void main(String[] args)
	{
		Cub obj = new Cub();
		obj.eat();
		obj.growl();
		obj.weep();
	}
}
