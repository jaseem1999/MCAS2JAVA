// Program to Sort strings
package CO2;

import java.util.Scanner;
class SortString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String a = sc.next();
        System.out.println("The string is: " + a);
        char[] b = a.toCharArray();
        char temp;
        for (int i = 0; i < b.length; i++) {
            for (int j = i + 1; j < b.length; j++) {
                if (b[i] > b[j]) {
                    temp = b[i];
                    b[i] = b[j];
                    b[j] = temp;
                }
            }
        }
        System.out.println("The sorted string is: ");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]);
        }     
    }
}
