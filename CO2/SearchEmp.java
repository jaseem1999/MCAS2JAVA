package CO2;

class SearchEmp {
    public static void main(String[] args) {
        Employee[] emp = new Employee[5];
        emp[0] = new Employee(1, "John", 1000);   
        emp[1] = new Employee(2, "Doe", 2000);
        emp[2] = new Employee(3, "Jane", 3000);
        emp[3] = new Employee(4, "Doe", 4000);
        emp[4] = new Employee(5, "John", 5000);
        int search = 2;
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


