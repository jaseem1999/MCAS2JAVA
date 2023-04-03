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
        float a = sc.nextFloat();
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
    float a;
    float l, b1, h1;
    public CoOver(float r) {
        this.r = r;
    }
    public CoOver(float b, float h) {
        this.b = b;
        this.h = h;
    }
    public void CoOver(float a) {
        this.a = a; 
    }
    public void CoOver(float l, float b1 , float h1) {
        this.l = l;
        this.b1 = b1;
        this.h1 = h1;
    }
    public float areaCircle() {
        return PI*(r * r);
    }
    public float areaTriangle() {
        return 0.5f*(b * h);
    }
    public float areaCub() {
        return 6*(a * a);
    }
    public float areaCuboid() {
        return 2*(l*b1 + b1*h1 + h1*l);
    }
}