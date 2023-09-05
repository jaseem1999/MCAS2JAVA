// Create an interface having prototypes of functions area() and perimeter(). Create two classes Circle and Rectangle which implements the above interface. Create a menu driven program to find area and perimeter of objects
package ExternalExam.CO3;
import java.util.Scanner;

interface Shape {
    void area();
    void perimeter();
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void area() {
        System.out.println("Area of circle: " + (Math.PI * radius * radius));
    }

    public void perimeter() {
        System.out.println("Perimeter of circle: " + (2 * Math.PI * radius));
    }
}

class Rectangle implements Shape {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void area() {
        System.out.println("Area of rectangle: " + (length * breadth));
    }

    public void perimeter() {
        System.out.println("Perimeter of rectangle: " + (2 * (length + breadth)));
    }
}

class Prototype {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        double radius, length, breadth;
        boolean flag = true;
        while(flag) {
            System.out.println("1. Circle\n2. Rectangle\n3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch(choice) {
                case 1:
                    System.out.print("Enter radius of circle: ");
                    radius = sc.nextDouble();
                    Circle c = new Circle(radius);
                    c.area();
                    c.perimeter();
                    break;
                case 2:
                    System.out.print("Enter length of rectangle: ");
                    length = sc.nextDouble();
                    System.out.print("Enter breadth of rectangle: ");
                    breadth = sc.nextDouble();
                    Rectangle r = new Rectangle(length, breadth);
                    r.area();
                    r.perimeter();
                    break;
                case 3:
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}