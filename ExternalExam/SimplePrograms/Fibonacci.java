package ExternalExam.SimplePrograms;

public class Fibonacci {
    
    public static void main(String[] args) {
        fibonacci(10);
    }
    public static void fibonacci(int n) {
        int a = 0;
        int b = 1;
        for (int i = 0; i < n; i++) {
            System.out.println(a);
            int c = a + b;
            a = b;
            b = c;
        }
    }
}
