package CO4.ArthOpPackage;
import CO4.ArthOpPackage.ArthOpPack;

public class ArthMain {
    public static void main(String[] args){
        ArthOpPack pack = new ArthOpPack();
        System.out.println("Addition: " + pack.add(10, 20));
        System.out.println("Subtraction: " + pack.sub(10, 20));
        System.out.println("Multiplication: " + pack.mul(10, 20));
        System.out.println("Division: " + pack.div(20, 10));

    }
}
