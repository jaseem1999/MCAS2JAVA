package ExternalExam.SamplQuestions.Add;
import java.util.Scanner;
import ExternalExam.SamplQuestions.Add.AddNumber;
import ExternalExam.SamplQuestions.Add.ConcateSring;
public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number ::");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        AddNumber s=new AddNumber(n1,n2);
        s.add();
        try{
            s.validation();
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Enter two words ::");
        String s1 = sc.next();
        String s2 = sc.next();
        ConcateSring c=new ConcateSring(s1,s2);
        try{
            System.out.println(c.validation());
        }catch(Exception e){
            System.out.println(e);
        }
        sc.close();
    }
}
