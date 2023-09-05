package ExternalExam.SimplePrograms;

import java.util.Scanner;

public class Palidrome {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in); 
        System.out.print("Enter a word :: ");
        String word = sc.next();
        char w[] = word.toCharArray(); 
        char rev[] = new char[word.length()];
        int j = 0;
        for (int i = w.length -1; i >=0; i--) {
            rev[j] = w[i];
            j++;
        }
        boolean flag = false;
        for(int i = 0; i <= rev.length - 1; i++){
            if(w[i] == rev[i]){
                flag = true;
            }else{
                flag = false;
                break;
            }
        }

        if(flag == true){
            System.out.println(word + " is a palindrome");
        }else{
            System.out.println(word + " is not a palindrome");
        }

    }
}
