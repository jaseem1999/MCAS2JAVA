//Program to create a class for Employee having attributes eNo, eName eSalary. Read n 
//employ information and Search for an employee given eNo, using the concept of Array of 
//Objects.
package ExternalExam;
import java.util.Scanner;

public class CO2SearchEmp {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Numbers of employees :: ");
        int n = sc.nextInt();
        Employee em[] = new Employee[n];
        for(int i=0; i<n; i++){
            System.out.println("Enter The Details of Employees index no ["+i+"] ::");
            System.out.print("Enter employee id :: ");
            int eNo = sc.nextInt();
            System.out.print("Enter employee Name :: ");
            String eName = sc.next();
            System.out.print("Enter employee id :: ");
            double eSalary = sc.nextDouble();
            em[i] = new Employee(eNo,eName,eSalary);
            System.out.println();
        }
        System.out.print("Enter Employee (id) You want search :: ");
        int key = sc.nextInt();
        for(int i =0; i<n;i++){
            if(key == em[i].eNo){
                System.out.println("Got it ::"+em[i].eNo);
                System.out.println("Name ::"+em[i].eName+" Salary :: "+em[i].eSalary);
                return;
            }
        }
        System.out.println("Sorry .... id dose not match");
        sc.close();
    }
    
}

class Employee{
    int eNo;
    String eName;
    double eSalary;
    Employee(int eNo, String eName, double eSalary){
        this.eNo = eNo;
        this.eName = eName;
        this.eSalary = eSalary;
    }
}
