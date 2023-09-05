// Implementing the  concept of Threads create two classes one class to display multiplication table of 5 and other to display Fibonacci 

package ExternalExam.SamplQuestions;

class Multiplication extends Thread{
    int num;
    public Multiplication(int num){
        this.num = num;
    }
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }
}

class Fibonacci extends Thread{
    int num;
    public Fibonacci(int num){
        this.num = num;
    }
    public void run(){
        int a = 0;
        int b = 1;
        for (int i = 1; i <= num; i++) {
            System.out.println(a);
            int c= a + b;
            a = b;
            b = c;
        }
    }
}


class ThreadMultFebi {
    public static void main(String[] args) {
        Multiplication m1 = new Multiplication(10);
        Fibonacci f1 = new Fibonacci(10);
        m1.start();
        f1.start();
    }
}
