package keywords;

public class StaticVar
{
	// Static variable
	public static String company = "ABC Corp";
	
	// Instance variable
	private int empid;
	private String empName;
	
	// Constructor
	public StaticVar(int empid, String empName)
	{
		this.empid = empid;
		this.empName = empName;
	}
	
	public void displayDetails()
	{
		System.out.println("Employee ID: "+empid);
		System.out.println("Employee Name: "+empName);
		System.out.println("Company: "+company); // Accessing the static variable
	}

	public static void main(String[] args) 
	{
		StaticVar obj1 = new StaticVar(101, "John");
		StaticVar obj2 = new StaticVar(102, "Alice");
		
		obj1.displayDetails();
		obj2.displayDetails();
	}
}
