package ExternalExam.SimplePrograms.OOPConcept;

public class Inheritence {
    public static void main(String[] args) {
        Employee employee = new Employee("Adil",24,"SDE2","Production",231);
        employee.display();
    }
}
class Person{
    String name;
    int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
}
class Employee extends Person{
    String desgination;
    String Department;
    int eid;
    public Employee(String name, int age, String desgination, String Department, int eid){
        super(name, age);
        this.desgination = desgination;
        this.Department = Department;
        this.eid = eid;   
    }
    void display(){
        System.out.println(name + " , " + age + " , " + desgination + " , " + Department + " , " + eid);
    }
}