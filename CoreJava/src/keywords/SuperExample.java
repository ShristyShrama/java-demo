package keywords;

// Parent class
class Animal
{
    String color = "White";

    void eat() 
    {
        System.out.println("Animal is eating");
    }
}

// Subclass inheriting from Animal
class Dog extends Animal 
{
    String color = "Brown";

    void displayColor() 
    {
        System.out.println("Dog color: " + color); // Accessing subclass color
        System.out.println("Animal color: " + super.color); // Accessing parent class color using 'super'
    }

    // Overriding the eat method of the parent class
    //@Override
    void eat() 
    {
        super.eat(); // Calling the parent class eat method using 'super'
        System.out.println("Dog is eating");
    }
}

public class SuperExample 
{
    public static void main(String[] args) 
    {
        Dog obj = new Dog();
        obj.displayColor(); // Calling the method to display colors
        obj.eat(); // Calling the overridden eat method
    }
}
