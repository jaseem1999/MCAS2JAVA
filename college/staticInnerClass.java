package college;
// Write a class with class name Student having attributes Roll no, name , mark. Create a inner class name sports with attribute sports name , activity point . Create a static class Admission with static attribute batch. Display batch details, student name ,roll no mark ,sports name and activity

class StudentStaticClasss {
    private int rollNo;
    private String name;
    private int mark;

    public StudentStaticClasss(int rollNo, String name, int mark) {
        this.rollNo = rollNo;
        this.name = name;
        this.mark = mark;
    }

    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + mark);
    }

    public class Sports {
        private String sportsName;
        private int activityPoint;

        public Sports(String sportsName, int activityPoint) {
            this.sportsName = sportsName;
            this.activityPoint = activityPoint;
        }

        public void displaySportsDetails() {
            System.out.println("Sports Name: " + sportsName);
            System.out.println("Activity Points: " + activityPoint);
        }
    }

    public static class Admission {
        public static String batch;

        public static void displayBatchDetails() {
            System.out.println("Batch: " + batch);
        }
    }
}
class StaticClassMain {
    public static void main(String[] args) {
        StudentStaticClasss student = new StudentStaticClasss(1, "John Doe", 90);
        student.displayDetails();

        StudentStaticClasss.Sports sports = student.new Sports("Football", 10);
        sports.displaySportsDetails();

        StudentStaticClasss.Admission.batch = "2023";
        StudentStaticClasss.Admission.displayBatchDetails();
    }
}


