package ExternalExam;
import java.util.Scanner;
public class CO2SearchArray {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in); 
        int n[] = {1,2,3,4,5,6};
        System.out.print("Enter the search key :: ");
        int key = sc.nextInt();
        for(int i =0; i < n.length; i++){
            if(n[i] == key){
                System.out.println("Got it :: "+n[i]);
                return;
            }
        }
        System.out.println("Sorry we can not find");


    }
}
