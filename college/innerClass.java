class Student{
        int rollNo;
        String name;
        int mark;
        public Student(int rollNo, String name, int mark){
                this.rollNo = rollNo;
                this.name = name;
                this.mark = mark;
        }
        class Sport{
                String sportName;
                int act_point;
                public Sport(String sportName, int act_point){
                        this.sportName = sportName;
                        this.act_point = act_point;
                }
        }
}

class StudentMain{
        public static void main(String arr[]){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter how many student you wont to Enter :: ");
                int n = sc.nextInt();
                Student st[] = new Student[n];
                Student.Sport sp[] = new Student.Sport[n];
                for(int i =0; i < n; i++ ){
                        System.out.print("Enter roll No ::");
                        int roll = sc.nextInt();
                        System.out.print("Enter name ::");
                        String name = sc.next();
                        System.out.print("Enter mark ::");
                        int mark = sc.nextInt();
                        st[i] = new  Student(roll,name,mark);
                        System.out.print("Enter sport item ::");
                        String spName = sc.next();
                        System.out.print("Enter activity point ::");
                        int point = sc.nextInt();
                        sp[i]=st[i].new Sport(spName,point);
                        System.out.println("--------------------------");

                }
                for(int i = 0 ; i < n; i++){
                        System.out.println("roll No :: "+st[i].rollNo);
                        System.out.println("Name :: "+st[i].name);
                        System.out.println("Mark :: "+st[i].mark);
                        System.out.println("Sport item :: "+sp[i].sportName);
                        System.out.println("Activity point :: "+sp[i].act_point);
                        System.out.println("---------------------------");
                }
	}
}