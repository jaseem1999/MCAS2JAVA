//Write a program using class and object concepts and display prime numbers upto a limit.
package college;
import java.util.Scanner;
class Prime{
    public static void main(String args[]){
        PrimeNumber obj=new PrimeNumber();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit");
        int n=sc.nextInt();
        obj.displayPrime(n);
        sc.close();
    }
}
class PrimeNumber{
    public void displayPrime(int n){
        for(int i=2;i<=n;i++){
            int count=0;
            for(int j=2;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==1){
                System.out.println(i);
            }
        }
    }
}
