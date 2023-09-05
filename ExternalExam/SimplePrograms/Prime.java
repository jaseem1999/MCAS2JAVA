package ExternalExam.SimplePrograms;
import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :: ");
        int n = sc.nextInt();
        int i, j;
        for (i = 2; i <= n; i++) {
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if (i == j) {
                System.out.println("Prime No :: "+i);
            }
        }
    }
}
