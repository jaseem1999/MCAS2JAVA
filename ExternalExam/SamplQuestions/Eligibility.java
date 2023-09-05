package ExternalExam.SamplQuestions;
import java.util.Scanner;

class AgeException extends Exception{
    AgeException(String message){
        super(message);
    }
}

class Age {
    int age;
    Age(int age){
        this.age =age;
    }
    public void validate() throws AgeException{
        if(age >= 18){
            System.out.print("Eligible for voting");
        }else{
            throw new AgeException("ageException");
        }
    }
}


public class Eligibility {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your age :: ");
        int age = sc.nextInt();
        try{
            Age eligible=new Age(age);
            eligible.validate(); 
        }catch(Exception e){
            System.out.println(e);
        }
        sc.close();
    }
}
