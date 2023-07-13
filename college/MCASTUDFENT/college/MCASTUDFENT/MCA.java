package college.MCASTUDFENT;
import java.util.Scanner;

class Mca{
        Scanner sc = new Scanner(System.in);
        String dptm;
        String hod;
        int strangth;
        public void getDetails(){
                System.out.print("Enter the Department Name :: ");
                dptm = sc.next();
                System.out.print("Enter the HOD Name :: ");
                hod = sc.next();
                System.out.print("Enter the Total Stranght of Dptmnt :: ");
                strangth = sc.nextInt();
        }
        public void display(){
                System.out.println("DEpartment Name :: "+dptm);
                System.out.println("HOD  :: "+hod);
                System.out.println("Student Strangth ::  "+strangth);
        }
}
class s1 extends Mca{
        Scanner sc =new Scanner(System.in);
        String sname;
        String saddr;
        int roll;
        public void getDetails(){
                super.getDetails();
                System.out.print("Enter the Student Name :: ");
                sname = sc.next();
                System.out.print("Enter the Student Address :: ");
                saddr = sc.next();
                System.out.print("Enter the Student Roll Number :: ");
                roll = sc.nextInt();

        }
        public void display(){
                super.display();
                System.out.println("Student Name :: "+sname);
                System.out.println("Student Addrees :: "+saddr);
                System.out.println("Student Roll no ::  "+roll);
        }

}
class Mooc extends s1{
        Scanner sc = new Scanner(System.in);
        String sub;
        int duration;
        public void getDetails(){
                super.getDetails();
			System.out.println("Enter the Subject (MOOC) :: ");
                sub = sc.next();
                System.out.println("Enter The Duration :: ");
                duration = sc.nextInt();
        }
        public void display(){
                super.display();
                System.out.println("Subject (MOOC) :: "+sub);
                System.out.println("Duration (MOOC) :: "+duration);

        }
}

class All{
        public static void main(String Arr[]){
                Mooc obj = new Mooc();
                obj.getDetails();
                obj.display();

        }
}

