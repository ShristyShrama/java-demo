package keywords;

public class StaticMethod 
{
	// Static method for adding two numbers
    public static int add(int a, int b) 
    {
        return a + b;
    }

    // Static method for subtracting two numbers
    public static int subtract(int a, int b) 
    {
        return a - b;
    }

    public static void main(String[] args) 
    {
        int num1 = 10;
        int num2 = 5;

        // Calling the static add method
        //int sum = StaticMethod.add(num1, num2);
        //System.out.println("Sum: " + sum);
        System.out.println(StaticMethod.add(num1, num2));

        // Calling the static subtract method
        int difference = StaticMethod.subtract(num1, num2);
        System.out.println("Difference: " + difference);
    }

}
