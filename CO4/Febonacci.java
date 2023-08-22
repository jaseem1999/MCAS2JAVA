//Define 2 classes; one for generating Fibonacci numbers and other for displaying even numbers in a given range. Implement using threads. (Runnable Interface) 
package CO4;
import java.util.Scanner;

class Fibonacci implements Runnable{
    int limit;

    Fibonacci(int limit) {
        this.limit = limit;
    }

    public void run() {
        int a = 0, b = 1, c = 0;
        System.out.println("Fibonacci series upto "+limit);
        while(c <= limit) {
            System.out.println(c);
            a = b;
            b = c;
            c = a+b;
        }
    }
}

class EvenNumbers implements Runnable{
    int limit;

    EvenNumbers(int limit) {
        this.limit = limit;
    }

    public void run() {
        System.out.println("Even numbers upto "+limit);
        for(int i=1;i<=limit;i++) {
            if(i%2 == 0)
                System.out.println(i);
        }
    }
}

public class Febonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit for Febonacci series:");
        int limit = sc.nextInt();
        Fibonacci f = new Fibonacci(limit);
        System.out.println("Enter the limit for even numbers:");
        limit = sc.nextInt();
        EvenNumbers e = new EvenNumbers(limit);
        Thread t1 = new Thread(f);
        Thread t2 = new Thread(e);
        t1.start();
        t2.start();
    }
}