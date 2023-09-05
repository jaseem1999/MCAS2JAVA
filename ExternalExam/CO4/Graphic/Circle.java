package ExternalExam.CO4.Graphic;

interface Shape{
    public void area();
    public void perimeter();
}

public class Circle implements Shape  {
    double r;
    public Circle(double r){
        this.r = r;
    }
    public void area(){
        double area = 3.44 * (r*r);
        System.out.println("Area of circle :: "+area);
    }
    public void perimeter(){
        double perimrter = 2*(3.44 * (r*r));
        System.out.println("perimrter of circle :: "+perimrter);
    }
}

