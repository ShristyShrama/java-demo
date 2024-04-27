package abstraction;

// Abstract class
abstract class Shape 
{
    // Abstract method to calculate area
    public abstract double calculateArea();
    
    // Non-abstract method
    public void display() 
    {
        System.out.println("This is a shape.");
    }
}

// Concrete subclass Circle extending Shape
class Circle extends Shape 
{
    private double radius;

    public Circle(double radius) 
    {
        this.radius = radius;
    }

    // Implementing the abstract method to calculate area for Circle
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class AbstractExample {
    public static void main(String[] args) {
        // Creating an instance of Circle
        Circle circle = new Circle(5.0);
        
        // Calling abstract method calculateArea
        double area = circle.calculateArea();
        System.out.println("Area of the circle: " + area);
        
        // Calling non-abstract method display
        circle.display();
    }
}