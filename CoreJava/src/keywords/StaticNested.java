package keywords;

public class StaticNested 
{
	 // Static nested class
    static class StaticNestedClass 
    {
        public void display() 
        {
            System.out.println("This is a static nested class");
        }
    }

    public static void main(String[] args) 
    {
        // Creating an instance of the static nested class
    	StaticNested.StaticNestedClass nestedObj = new StaticNested.StaticNestedClass();
        nestedObj.display();
    }
}
