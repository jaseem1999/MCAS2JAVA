package college.ConstructorOve.Overload2;
import java.util.Scanner;


class AreaShape{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle");
        float r = sc.nextFloat();
        CoOver co = new CoOver(r);
        System.out.println("Enter the base of triangle");
        float b = sc.nextFloat();
        System.out.println("Enter the height of triangle");
        float h = sc.nextFloat();
        CoOver co1 = new CoOver(b, h);
        System.out.println("Enter the length of cube");
        double a = sc.nextDouble();
        co.CoOver(a);
        System.out.println("Enter the length of cuboid");
        float l = sc.nextFloat();
        System.out.println("Enter the breadth of cuboid");
        float b1 = sc.nextFloat();
        System.out.println("Enter the height of cuboid");
        float h1 = sc.nextFloat();
        co.CoOver(l, b1, h1);
        System.out.println("Area of circle is " + co.areaCircle());
        System.out.println("Area of triangle is " + co1.areaTriangle());
        System.out.println("Area of cube is " + co.areaCub());
        System.out.println("Area of cuboid is " + co.areaCuboid());
    }

}
class CoOver {
    float PI = 3.14f;
    float r;
    float b, h;
    double a;
    float l, b1, h1;
    public CoOver(float r) {
        this.r = r;
    }
    public void CoOver(float l2, float b12, float h12) {
        this.l = l2;
        this.b1 = b12;
        this.h1 = h12;
    }
    public CoOver(float b, float h) {
        this.b = b;
        this.h = h;
    }
    public void CoOver(double a) {
        this.a = a; 
    }
   
    public float areaCircle() {
        return PI*(r * r);
    }
    public float areaTriangle() {
        return 0.5f*(b * h);
    }
    public double areaCub() {
        return 6*(a * a);
    }
    public float areaCuboid() {
        return 2*(l*b1 + b1*h1 + h1*l);
    }
}