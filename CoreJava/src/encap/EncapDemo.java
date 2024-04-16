package encap;

public class EncapDemo {

	public static void main(String[] args)
	{
		Employee e = new Employee();
		e.setAge(33);
		e.setName("Robert");
		e.setEmpID(1253);
		
		System.out.println("Employee's age: "+e.getAge());
		System.out.println("Employee's name: "+e.getName());
		System.out.println("Employee's ID: "+e.getEmpID());
	}

}
