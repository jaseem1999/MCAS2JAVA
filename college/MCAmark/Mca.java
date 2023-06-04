package college.MCAmark;
import java.util.Scanner;
class Mca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students");
        int n = sc.nextInt();
        Mark[] m = new Mark[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the roll number of student " + (i+1));
            int roll = sc.nextInt();
            System.out.println("Enter the name of student " + (i+1));
            String name = sc.next();
            System.out.println("Enter the 3 subject marks of student less than 100 " + (i+1));
            float m1 = sc.nextFloat();
            float m2 = sc.nextFloat();
            float m3 = sc.nextFloat();
            m[i] = new Mark(roll, name, m1, m2, m3);
        }
        float max = m[0].percentage();
        int index = 0;
        for (int i = 1; i < n; i++) {
            if (m[i].percentage() > max) {
                max = m[i].percentage();
                index = i;
            }
        }
        System.out.println("The topper is " + m[index].name + " with roll number " + m[index].roll + " with percentage " + m[index].percentage());
    }
}
class Mark{
    int roll;
    String name;
    float m1, m2, m3;
    public Mark(int roll, String name, float m1, float m2, float m3) {
        this.roll = roll;
        this.name = name;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }
    public float percentage() {
        float total = m1 + m2 + m3;
        return (total/300)*100;
    }
}
