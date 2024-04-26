package keywords;

public class Student
{
    String name;
    int age;

    // Constructor with parameters
    public Student(String name, int age) 
    {
        this.name = name; // Using 'this' to refer to the class attribute 'name'
        this.age = age;   // Using 'this' to refer to the class attribute 'age'
    }

    // Method to display student details
    public void displayDetails() 
    {
        System.out.println("Student Name: " + this.name); // Using 'this' to access the class attribute 'name'
        System.out.println("Student Age: " + this.age);   // Using 'this' to access the class attribute 'age'
    }

    public static void main(String[] args) 
    {
        Student obj1 = new Student("Alice", 20);
        Student obj2 = new Student("Shristy", 25);
        obj1.displayDetails(); // Calling the method to display student details
        obj2.displayDetails();
    }
}