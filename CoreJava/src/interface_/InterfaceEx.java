package interface_;

interface Displayable
{
	void display();
}

interface Exhibition
{
	void exhibit();
}

public class InterfaceEx implements Displayable, Exhibition
{
	public void display()
	{
		System.out.println("Displayed");
	}
	
	public void exhibit()
	{
		System.out.println("Exhibited");
	}
	
	public static void main(String[] args) 
	{
		InterfaceEx obj = new InterfaceEx();
		obj.display();
		obj.exhibit();
	}

}
