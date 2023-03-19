///Write a program using class and object concepts and dispay fibonacci series upto a limit
package college;
import java.util.Scanner;
class Fibonacci
{
    public static void main(String args[]){
        Series obj=new Series();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit");
        int n=sc.nextInt();
        obj.displayFibonacci(n);
        sc.close();
    }
}
class Series{
    public void displayFibonacci(int n){
        int a=0,b=1,c;
        System.out.println(a);
        System.out.println(b);
        for(int i=2;i<n;i++){
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}