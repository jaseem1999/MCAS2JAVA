package college.ConstructorOve;
import java.util.Scanner;
class Area{
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
        System.out.println("Area of circle is " + co.areaCircle());
        System.out.println("Area of triangle is " + co1.areaTriangle());
    }

}

class CoOver {
    float PI = 3.14f;
    float r;
    float b, h;
    public CoOver(float r) {
        this.r = r;
    }
    public CoOver(float b, float h) {
        this.b = b;
        this.h = h;
    }
    public float areaCircle() {
        return PI*(r * r);
    }
    public float areaTriangle() {
        return 0.5f*(b * h);
    }
}
