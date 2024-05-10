package java_programs;

public class NumberPalindromeChecker 
{
    // Method to check if a number is a palindrome
    static boolean isPalindrome(int number)
    {
        int originalNumber = number;
        int reversedNumber = 0;

        // Reverse the number
        while (number != 0)
        {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        // Check if the original number is equal to the reversed number
        return originalNumber == reversedNumber;
    }

    public static void main(String[] args) 
    {
        int number = 12321; // Example number to check
        if (isPalindrome(number)) 
        {
            System.out.println("The number " + number + " is a palindrome.");
        } else {
            System.out.println("The number " + number + " is not a palindrome.");
        }
    }
}
