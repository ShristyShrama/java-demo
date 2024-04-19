package keywords;

public class StaticBlock 
{
	// Static variable
    public static String message;

    // Static block for initialization
    static {
        message = "This is a static block example";
        System.out.println("Static block is executed");
    }

    public static void main(String[] args) {
        System.out.println("Message: " + message);
    }
}
