package college;
import java.util.Scanner;

class SimplCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculate c = new Calculate();
        System.out.print("Enter the first number ::");
        int a = sc.nextInt();
        System.out.print("Enter the second number ::");
        int b = sc.nextInt();
        System.out.println("Enter Operation simbol (+, -, *, /, %)");
        char op = sc.next().charAt(0);
        switch(op){
            case '+':
                System.out.println("Addition of " + a + " and " + b + " is " + c.add(a, b));
                break;
            case '-':
                System.out.println("Subtraction of " + a + " and " + b + " is " + c.sub(a, b));
                break;
            case '*':
                System.out.println("Multiplication of " + a + " and " + b + " is " + c.mul(a, b));
                break;
            case '/':
                System.out.println("Division of " + a + " and " + b + " is " + c.div(a, b));
                break;
            case '%':
                System.out.println("Modulus of " + a + " and " + b + " is " + c.mod(a, b));
                break;
            default:
                System.out.println("Invalid Operation");
        }


    }
    
}
class Calculate {
    public int add(int a, int b) {
        return a + b;
    }
    public int sub(int a, int b) {
        return a - b;
    }
    public int mul(int a, int b) {
        return a * b;
    }
    public int div(int a, int b) {
        return a / b;
    }
    public int mod(int a, int b) {
        return a % b;
    }
   
}
