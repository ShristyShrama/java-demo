package jump_stmt;

public class ContinueStmt {

	public static void main(String[] args)
	{
		int [] numbers = {5, 15, 25, 35, 45};
		
		for(int x: numbers)
		{
			if(x == 25)
			{
				continue;
			}
			System.out.println(x);
		}
		

	}

}
