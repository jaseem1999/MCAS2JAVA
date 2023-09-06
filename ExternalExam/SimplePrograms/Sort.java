//Create a package “SORT” within that create two class  one class to enter 5 subjects name and sort them and 
//other class to enter the 5 numbers and sort them 

package ExternalExam.SimplePrograms;
import java.util.Arrays;
import java.util.Scanner;

public class Sort {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s[] = new String[5];
        for(int i = 0; i < 5; i++){
            System.out.println("Enter the subject name["+i+"] :: ");
            s[i] = sc.next();
        }
        Subject s1 =new Subject(s);
        int n [] = new int[5];
        for(int i = 0; i < 5; i++){
            System.out.println("Enter the Number index["+i+"] :: ");
            n[i] = sc.nextInt();
        }
        Number n1=new Number(n);
        s1.sort();
        s1.display();
        System.out.println();
        n1.sort();
        n1.display();

    }
}

class Subject {
        String subjects[];
        public Subject(String subjects[]){
            this.subjects = subjects;
        }
        public void sort(){
            Arrays.sort(subjects);
        }
        void display(){
            for(int i = 0; i < subjects.length; i++){
                System.out.println(subjects[i]);
            }
        }
}

class Number{
    int num[];
    Number(int num[]){
        this.num = num;
    }
    public void sort(){
            Arrays.sort(num);
        }
        void display(){
            for(int i = 0; i < num.length; i++){
                System.out.println(num[i]);
            }
        }
}
