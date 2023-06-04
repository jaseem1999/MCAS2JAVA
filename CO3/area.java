package CO3;
import java.util.Scanner;


class AreaShape{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle: ");
        float r = sc.nextFloat();
        CoOver co = new CoOver(r);
        System.out.println("Enter the base and height of triangle: ");
        float b = sc.nextFloat();
        float h = sc.nextFloat();
        CoOver co1 = new CoOver(b, h);
        System.out.println("Enter the side of cube: ");
        double a = sc.nextDouble();
        CoOver co2 = new CoOver(a);
        System.out.println("Enter the length, breadth and height of cuboid: ");
        float l = sc.nextFloat();
        float b1 = sc.nextFloat();
        float h1 = sc.nextFloat();
        CoOver co3 = new CoOver(l, b1, h1);
        System.out.println("Area of circle: " + co.areaCircle());
        System.out.println("Area of triangle: " + co1.areaTriangle());
        System.out.println("Area of cube: " + co2.areaCub());
        System.out.println("Area of cuboid: " + co3.areaCuboid());
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
    public CoOver(float l2, float b12, float h12) {
        this.l = l2;
        this.b1 = b12;
        this.h1 = h12;
    }
    public CoOver(float b, float h) {
        this.b = b;
        this.h = h;
    }
    public CoOver(double a) {
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