package ExternalExam;

import java.util.Scanner;

public class CO3Employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of teachers: ");
        int N = sc.nextInt();
        Teacher[] teachers = new Teacher[N];
        
        for (int i = 0; i < N; i++) {
            System.out.println("Enter the details of Teacher index [" + (i + 1) + "]");
            System.out.print("Empid: ");
            int Empid = sc.nextInt();
            System.out.print("Enter Name: ");
            String Name = sc.next();
            System.out.print("Enter Salary: ");
            double Salary = sc.nextDouble();
            System.out.print("Enter Address: ");
            String Address = sc.next();
            System.out.print("Enter Department: ");
            String department = sc.next();
            System.out.print("Enter Number of Subjects: ");
            int numSubjects = sc.nextInt();
            sc.nextLine(); // Consume the newline left in the buffer
            
            String[] Subjects = new String[numSubjects];
            System.out.println("Enter the subjects: ");
            for (int j = 0; j < numSubjects; j++) {
                Subjects[j] = sc.nextLine();
            }
            teachers[i] = new Teacher(Empid, Name, Salary, Address, department, Subjects);
            System.out.println();
        }
        
        for (int i = 0; i < N; i++) {
            teachers[i].display();
        }
        
        sc.close();
    }
}

class Employee {
    int Empid;
    String Name;
    double Salary;
    String Address;

    public Employee(int Empid, String Name, double Salary, String Address) {
        this.Empid = Empid;
        this.Name = Name;
        this.Salary = Salary;
        this.Address = Address;
    }
}

class Teacher extends Employee {
    String department;
    String[] Subjects;

    public Teacher(int Empid, String Name, double Salary, String Address, String department, String[] Subjects) {
        super(Empid, Name, Salary, Address);
        this.department = department;
        this.Subjects = Subjects;
    }

    public void display() {
        System.out.println("Empid: " + Empid);
        System.out.println("Name: " + Name);
        System.out.println("Salary: " + Salary);
        System.out.println("Address: " + Address);
        System.out.println("Department: " + department);
        System.out.println("Subjects:");
        for (String subject : Subjects) {
            System.out.println("- " + subject);
        }
        System.out.println();
    }
}
