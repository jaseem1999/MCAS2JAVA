package college;
import java.util.Scanner;
class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}

class User {
    public void validateAge(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("You are not eligible to vote");
        } else {
            System.out.println("You are eligible to vote");
        }
    }
}

public class UserException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        User user = new User();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        try {
            user.validateAge(age);
        } catch (AgeException e) {
            System.out.println(e);
        }
        sc.close();
    }
    
}
