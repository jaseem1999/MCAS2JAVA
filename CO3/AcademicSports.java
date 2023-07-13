package CO3;
//Create classes Student and Sports. Create another class Result inherited from Student and Sports.Display the academic and sports score of a student.


import java.util.Scanner;
public class AcademicSports {
    public static void main(String[] args) {
        new Result();
    }
}

class Student {
    int roll_no;
    String name;
    int mark1, mark2, mark3;
    Scanner sc = new Scanner(System.in);

    public Student() {
        System.out.println("Enter the roll number: ");
        roll_no = sc.nextInt();
        System.out.println("Enter the name: ");
        name = sc.next();
        System.out.println("Enter the mark1: ");
        mark1 = sc.nextInt();
        System.out.println("Enter the mark2: ");
        mark2 = sc.nextInt();
        System.out.println("Enter the mark3: ");
        mark3 = sc.nextInt();
    }
}

class Sports extends Student {
    int score;
    Scanner sc = new Scanner(System.in);

    public Sports() {
        System.out.println("Enter the score: ");
        score = sc.nextInt();
    }
}

class Result extends Sports {
    public Result() {
        System.out.println("Roll number: " + roll_no);
        System.out.println("Name: " + name);
        System.out.println("Mark1: " + mark1);
        System.out.println("Mark2: " + mark2);
        System.out.println("Mark3: " + mark3);
        System.out.println("Score: " + score);
    }
}
