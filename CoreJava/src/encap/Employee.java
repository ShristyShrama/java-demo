package encap;

public class Employee
{
	private String Name;
	private int EmpID;
	private int Age;
	
	//set methods -- always use to set values
	public void setAge(int valueAge)
	{
		Age = valueAge;
	}
	
	public void setName(String valueName)
	{
		Name = valueName;
	}
	
	public void setEmpID(int valueEmpID)
	{
		EmpID = valueEmpID;
	}
	
	//get methods -- always use to get the data
	public int getAge()
	{
		return Age;
	}
	
	public String getName()
	{
		return Name;
	}
	
	public int getEmpID()
	{
		return EmpID;
	}
}
