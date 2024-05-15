package java_programs;

public class StringPalindromeChecker 
{

	public static void main(String[] args)
	{
		String inputString = "A man, a plan, a canal, Panama"; // example
		boolean isPalindrome = isPalindrome(inputString);
		
		if(isPalindrome)
		{
			System.out.println("" +inputString+ " --> This string is palindrome.");
		}
		else
		{
			System.out.println("" +inputString+ " --> This string is not palindrome.");
		}
	}
	
	public static boolean isPalindrome(String str)
	{
		// Remove non-alphanumeric characters & convert to lower case
		String cleanString = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		
		// Initialize pointers for start & end of string
		int left = 0;
		int right = cleanString.length() - 1;
		
		// Check characters from both ends
		while(left < right)
		{
			if(cleanString.charAt(left) != cleanString.charAt(right))
			{
				return false;
			}
			
			left++;
			right--;
		}
		
		return true;
	}
}

