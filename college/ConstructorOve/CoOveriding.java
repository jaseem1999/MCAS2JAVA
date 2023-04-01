package college.ConstructorOve;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        CoOveriding co = new CoOveriding();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of cube");
        float a = sc.nextFloat();
        co.CoOveriding(a);
        System.out.println("Enter the length of cuboid");
        float l = sc.nextFloat();
        System.out.println("Enter the breadth of cuboid");
        float b = sc.nextFloat();
        System.out.println("Enter the height of cuboid");
        float h = sc.nextFloat();
        co.CoOveriding(l, b, h);
        System.out.println("Area of cube is " + co.areaCub());
        System.out.println("Area of cuboid is " + co.areaCuboid());
    }
}

class CoOveriding {
    float l, b,h, a;
    public void CoOveriding(float l, float b , float h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }
    public void CoOveriding(float a) {
        this.a = a; 
    }
    public float areaCuboid() {
        return 2*(l*b + b*h + h*l);
    }
    public float areaCub() {
        return 6*(a * a);
    }
}
