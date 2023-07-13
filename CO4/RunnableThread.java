import java.util.Scanner;
class Even implements Runnable{
        int n;
        Even(int n){
                this.n = n;
        }
        public void run(){
                System.out.println("Even numbers of range"+n+" is :: ");
                for(int i = 1; i <= n ; i++){
                        if(i % 2 == 0){
                                System.out.println("Even no :: "+i);
                        }
                }
        }
}

class Fibonacci implements Runnable {
         int n;
        Fibonacci(int n){
                this.n=n;
        }
        public void run(){
                int a1=0;
                int a2=1;
                for(int i=0;i<n;i++){
                        System.out.println("fibonacci:"+a1);
                        int a3=a2+a1;
                        a1=a2;
                        a2=a3;
                }
        }
}

class ThreadFebEvenMain{
        public static void main(String arg[]){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter the range of fibonacci series:");
                int n=sc.nextInt();
                System.out.println("Enter range of even numbers:");
                int a=sc.nextInt();
                Fibonacci obj1=new Fibonacci(n);
                Even obj2=new Even(a);
                Thread t1=new Thread(obj1);
                Thread t2=new Thread(obj2);
                t1.start();
                t2.start();
        }

}
