package CO4.Graphics;
import CO4.Graphics.Shape.Rectangle;
import CO4.Graphics.Shape.Square;
import CO4.Graphics.Shape.Circle;
import CO4.Graphics.Shape.Triangle;
import java.util.Scanner;
public class MainShape {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length and breadth of Rectangle: ");
        int l = sc.nextInt();
        int b = sc.nextInt();
        Shape s = new Shape();
        Rectangle r = s.new Rectangle(l, b);
        r.area();
        System.out.println("Enter the side of Square: ");
        int side = sc.nextInt();
        Square sq = s.new Square(side);
        sq.area();
        System.out.println("Enter the radius of Circle: ");
        double radius = sc.nextInt();
        Circle c = s.new Circle(radius);
        c.area();
        System.out.println("Enter the base and height of Triangle: ");
        double base = sc.nextInt();
        double height = sc.nextInt();
        Triangle t = s.new Triangle(base, height);
        t.area();
    }
}
