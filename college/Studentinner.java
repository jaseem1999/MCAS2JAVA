package college;

import java.util.Scanner;

// Write a class with class name Student having attributes Roll no, name , mark. Create a inner class name sports with attribute sports name , activity point . Display student name ,roll no mark ,sports name and activity
class Studentinner {
    int rollno;
    String name;
    int mark;
    Studentinner(int r, String n, int m){
        rollno = r;
        name = n;
        mark = m;
    }
    class Sports{
        String sportsname;
        int activitypoint;
        Sports(String s, int a){
            sportsname = s;
            activitypoint = a;
        }
    }
}

class MStudentinner{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students");
        int n = sc.nextInt();
        Studentinner s[] = new Studentinner[n];
        Studentinner.Sports sp[] = new Studentinner.Sports[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the roll no, name and mark of student "+(i+1));
            int r = sc.nextInt();
            String name = sc.next();
            int m = sc.nextInt();
            s[i] = new Studentinner(r,name,m);
            System.out.println("Enter the sports name and activity point of student "+(i+1));
            String sn = sc.next();
            int ap = sc.nextInt();
            sp[i] = s[i].new Sports(sn,ap);
        }

        for(int i=0;i<n;i++){
            System.out.println("Student "+(i+1));
            System.out.println("Roll No : "+s[i].rollno);
            System.out.println("Name : "+s[i].name);
            System.out.println("Mark : "+s[i].mark);
            System.out.println("Sports Name : "+sp[i].sportsname);
            System.out.println("Activity Point : "+sp[i].activitypoint);
        }
    }
}

