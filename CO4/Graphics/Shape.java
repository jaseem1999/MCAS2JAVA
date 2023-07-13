package CO4.Graphics;

interface ShapeGraphics{
    public void area();
}

public class Shape  {

    class Rectangle implements ShapeGraphics{
        int length;
        int breadth;
        Rectangle(int l, int b){
            length = l;
            breadth = b;
        }
        public void area(){
            System.out.println("Area of Rectangle: "+(length*breadth));
        }
    }

    class Square implements ShapeGraphics{
        int side;
        Square(int s){
            side = s;
        }
        public void area(){
            System.out.println("Area of Square: "+(side*side));
        }
    }

    class Circle implements ShapeGraphics{
        double radius;
        Circle(double r){
            radius = r;
        }
        public void area(){
            System.out.println("Area of Circle: "+(3.14*radius*radius));
        }
    }

    class Triangle implements ShapeGraphics{
        double base;
        double height;
        Triangle(double b, double h){
            base = b;
            height = h;
        }
        public void area(){
            System.out.println("Area of Triangle: "+(0.5*base*height));
        }
    }

    
}
