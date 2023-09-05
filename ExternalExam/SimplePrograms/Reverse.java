package ExternalExam.SimplePrograms;
import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number :: ");
        int num=sc.nextInt();
        int tamp =0;
        while (num != 0) {
            int rem = num % 10;
            num = num / 10;
            tamp = tamp * 10 + rem;
        }
        System.out.println(tamp);
    }
}
