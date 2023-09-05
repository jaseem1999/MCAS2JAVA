package ExternalExam.SimplePrograms.OOPConcept;

// Base class - Shape
abstract class Shape {
    // Abstract method to calculate area
    public abstract double calculateArea();
}

// Derived class - Circle
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Derived class - Rectangle
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        // Create an array of shapes
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(5.0);
        shapes[1] = new Rectangle(4.0, 6.0);

        // Calculate and print the areas of shapes using polymorphism
        for (Shape shape : shapes) {
            double area = shape.calculateArea();
            System.out.println("Area: " + area);
        }
    }
}

