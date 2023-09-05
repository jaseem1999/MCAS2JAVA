package ExternalExam;

import java.util.Scanner;



public class CO3Shape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape s = new Shape();
        System.out.println("Enter the radius of circle: ");
        double r = sc.nextDouble();
        System.out.println("Enter the side of square: ");
        int side = sc.nextInt();
        System.out.println("Enter the height Rectangle: ");
        int l = sc.nextInt();
        System.out.println("Enter the base: Rectangle");
        int b = sc.nextInt();
        System.out.println("Enter the height Triangle: ");
        double l1 = sc.nextInt();
        System.out.println("Enter the breadth Triangle");
        double b2 = sc.nextInt();
        System.out.println("Circle area ::"+s.area(r));
        System.out.println("Square area ::"+s.area(side));
        System.out.println("Rectangle area ::"+s.area(l,b));
        System.out.println("Triangle area ::"+s.area(l1,b2));
        sc.close();
    }
}

class Shape{
    public double area(double r){
        return 3.14 * (r*r);
    }
    public int area(int side){
        return side * side;
    }
    public int area(int length, int beadth){
        return length * beadth;
    }
    public double area(double b, double h){
        return (b * h)/2;
    }
}
