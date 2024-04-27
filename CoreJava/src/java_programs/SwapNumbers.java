package java_programs;

public class SwapNumbers 
{
    public static void main(String[] args) 
    {
        int a = 50;
        int b = 60;

        System.out.println("Before swapping -> a: " + a + ", b: " + b);

        // Swapping logic without using a third variable
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping -> a: " + a + ", b: " + b);
    }
}