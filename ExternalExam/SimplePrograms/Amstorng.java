package ExternalExam.SimplePrograms;

import java.util.Scanner;

public class Amstorng {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number ::");
        int n=sc.nextInt();
        int temp = n;
        int sum = 0;
        while (temp != 0) {
            int r = temp % 10;
            sum = sum + r * r * r;
            temp = temp / 10;
        }
        if (sum == n) {
            System.out.println("Amstrong Number");
        } else {
            System.out.println("Not Amstrong Number");
        }
    }
}
