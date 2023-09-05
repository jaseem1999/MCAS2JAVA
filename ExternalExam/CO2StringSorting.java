package ExternalExam;
import java.util.Scanner;
public class CO2StringSorting {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string :: ");
        String str = sc.next();
        System.out.println("String :: "+str);
        char []b = str.toCharArray();
        for(int i = 0;i < b.length; i++){
            for(int j = i+1; j < b.length; j++){
                if( b[i] > b[j]){
                    char temp = b[i];
                    b[i] = b[j];
                    b[j] = temp;  
                }
            }    
        }
        for(int i =0; i<b.length; i++){
            System.out.print(b[i]);
        }
        sc.close();
    }
    
}
