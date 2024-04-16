package jump_stmt;

public class ReturnStmt {

	public static void main(String[] args)
	{
		boolean t = true;
		System.out.println("return executed");
		
		if(t)
		{
			return;
		}
		
		System.out.println("Not Executed");
		

	}

}
