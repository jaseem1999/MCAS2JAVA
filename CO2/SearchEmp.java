package CO2;

import java.util.Scanner;
class SearchEmp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of employees: ");
        int size = sc.nextInt();
        Employee[] emp = new Employee[size];
        for (int i = 0; i < emp.length; i++) {
            System.out.println("Enter the employee number: ");
            int no = sc.nextInt();
            System.out.println("Enter the employee name: ");
            String name = sc.next();
            System.out.println("Enter the employee salary: ");
            double salary = sc.nextDouble();
            emp[i] = new Employee(no, name, salary);
        }
        System.out.println("Enter the employee number to search: ");
        int search = sc.nextInt();
        for (int i = 0; i < emp.length; i++) {
            if (emp[i].eNo == search) {
                System.out.println("Employee found at index " + i);
                System.out.println("Employee No: " + emp[i].eNo);
                System.out.println("Employee Name: " + emp[i].eName);
                System.out.println("Employee Salary: " + emp[i].eSalary);
                break;
            }
        }
    }
}

class Employee{
    int eNo;
    String eName;
    double eSalary;
    Employee(int no, String name, double salary){
        eNo = no;
        eName = name;
        eSalary = salary;
    }
}


