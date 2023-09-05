package ExternalExam.CO4;

public class ManuplationThread {
    public static void main(String[] args) {
        Multiplication multiplication = new Multiplication(5);
        Prime prime = new Prime(20);
        Even even = new Even(10);
        Thread th1 = new Thread(even);
        multiplication.start();
        prime.start();
        th1.start();
    }
}

class Even implements Runnable{
    int n;
    Even(int n){
        this.n = n;
    }
    public void run(){
        for(int i=1; i<=n; i++){
            if(i%2 == 0)
                System.out.println("Even :: "+i);
        }
    }
}

class Multiplication extends Thread{
    int n;
    Multiplication(int n){
        this.n = n;
    }
    public void run(){
        for(int i=1; i<=n; i++){
            System.out.println("Multiplication :: "+i*n);
        }
    }
}

class Prime extends Thread{
    int n;
    Prime(int n){
        this.n = n;
    }
    public void run(){
        for(int i=2;i<=n;i++) {
            int count = 0;
            for(int j=1;j<=i;j++) {
                if(i%j == 0)
                    count = count+1;
            }
            if(count == 2)
                System.out.println("Prime ::"+i);
        }
    }
}