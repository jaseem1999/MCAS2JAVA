//Write a program using class and object concepts and check whether number is armstrong Number
package college;
import java.util.Scanner;

class Amstrong{
    public static void main(String args[]){
        AmstrongNumber obj=new AmstrongNumber();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        obj.checkAmstrong(n);
        sc.close();
        
    }
}
class AmstrongNumber{
    public void checkAmstrong(int n){
        int temp=n;
        int sum=0;
        while(temp!=0){
            int r=temp%10;
            sum=sum+r*r*r;
            temp=temp/10;
        }
        if(sum==n){
            System.out.println("Amstrong Number");
        }
        else{
            System.out.println("Not Amstrong Number");
        }
    }
}