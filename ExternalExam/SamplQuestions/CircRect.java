//Create an interface having prototypes of functions area() and perimeter(). Create two
//classes Circle and Rectangle  which implements the above interface. 
//Create a menu driven program to find area and perimeter of objects
package ExternalExam.SamplQuestions;

import java.util.Scanner;

interface Shape{
    double area();
    double perimeter();
}

class Circle implements Shape{
    double radius;
    Circle(double radius){
        this.radius = radius;
    }
    @Override
    public double area() {
        return 3.14*(radius * radius);
    }
    @Override
    public double perimeter() {
        return 2*(3.14*(radius * radius));
    }
}

class Rectangle implements Shape{
    double height, width;
    Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }
    @Override
    public double area() {
        return height * width;
    }
    @Override
    public double perimeter() {
        return 2*(height + width);
    }
}

class CircRect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while(flag){
            System.out.println(" 1. Circle");
            System.out.println(" 2. Rectangle");
            System.out.println(" 3. Exit");
            System.out.print("Enter your choise :: ");
            int c = sc.nextInt();
            switch(c){
                case 1 :
                    System.out.print("Enter the Radius :: ");
                    double r = sc.nextInt();
                    Shape circle = new Circle(r);
                    System.out.println("Area of circle :: "+ circle.area());
                    System.out.println("Perimeter of circle :: "+ circle.perimeter());
                    break;
                case 2:
                    System.out.print("Enter the Height and width :: ");
                    double h = sc.nextInt();
                    double w = sc.nextInt();
                    Shape rectangle = new Rectangle(h,w);
                    System.out.println("Area of Rectangle :: "+ rectangle.area());
                    System.out.println("Perimeter of Rectangle :: "+ rectangle.perimeter());
                    break;
                case 3:
                    System.out.println("Exit... ");
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid... ");
                    break;
            }
        }
        sc.close();
    }
}
