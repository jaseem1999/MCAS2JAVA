package ExternalExam.CO4;
import java.util.Scanner;
public class Negative {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter five numbers :: ");
        int a[] = new int[5];
        for(int i =0; i < 5; i++){
            try{
                int n = sc.nextInt();
                CheckNegative check= new CheckNegative(n);
                a[i] = check.validate();
            }catch(Exception e){
                System.out.println(e);
            }
        }
        System.out.println("Element is ::");
        for(int i = 0;i < 5; i++){
            System.out.println(a[i]);
        }
        sc.close(); 
    }
}
class NegativeException extends Exception{
    NegativeException(String message){
        super(message);  
    }
}
class CheckNegative{
    int n;
    CheckNegative(int n){
        this.n =n;
    }
    public int validate()throws NegativeException{
        if(n < 0){
            throw new NegativeException("Negative number");
        }
        return n;
    }
}