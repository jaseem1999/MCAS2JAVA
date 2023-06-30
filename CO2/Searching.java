package CO2;
import java.util.Scanner;
class Searching {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Search s = new Search();
        System.out.println("Enter the number element to be searched: ");
        int item = sc.nextInt();
        s.num(item);
        System.out.println("Enter the string element to be searched: ");
        String str = sc.next();
        s.StrSearch(str);
    }    
}

class  Search{
    public void num(int item){
        int[] a = { 1, 4, 6, 7, 8, 9, 10, 12, 14, 15 };
        int key = item;
        int flag = 0;
        int pos = 0;
        // Program to search for an element in an array
        System.out.println("The array is: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        for (int i = 0; i < a.length; i++) {
            if (key == a[i]) {
                flag = 1;
                pos = i;
                break;
            } else {
                flag = 0;
            }
        }
        if (flag == 1) {
            System.out.println("\nThe element " + key + " is found at position " + pos);
        } else {
            System.out.println("\nThe element " + key + " is not found");
        }
    }
    public void StrSearch(String str){
        String[] s = { "apple", "banana", "mango", "orange", "grapes", "pineapple", "papaya", "jackfruit", "watermelon",
                "muskmelon" };
        String key = str;
        int flag = 0;
        int pos = 0;
        // Program to search for an element in an array
        System.out.println("The array is: ");
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i] + " ");
        }
        for (int i = 0; i < s.length; i++) {
            if (key.equals(s[i])) {
                flag = 1;
                pos = i;
                break;
            } else {
                flag = 0;
            }
        }
        if (flag == 1) {
            System.out.println("\nThe element " + key + " is found at position " + pos);
        } else {
            System.out.println("\nThe element " + key + " is not found");
        }
    }
}
