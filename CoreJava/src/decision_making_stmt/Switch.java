package decision_making_stmt;

public class Switch
{
	public static void main(String[] args)
	{
		int rank = 5;
		
		switch (rank)
		{
		case 1:
			System.out.println("You are topper");
		break;
		
		case 2:
			System.out.println("Your rank is 2nd");
		break;
		
		case 3:
			System.out.println("Your rank is 3rd");
		break;
		
		default:
			System.out.println("Better luck next time");
		}
	}
}
