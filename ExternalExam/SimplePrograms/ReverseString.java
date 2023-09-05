package ExternalExam.SimplePrograms;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string ::");
        String str = sc.next();
        System.out.println("Orginal: " + str);
        for(int i = str.length(); i > 0; i--) {
            System.out.print(str.charAt(i-1));
        }
    }
}
