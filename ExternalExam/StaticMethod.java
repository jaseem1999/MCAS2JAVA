package ExternalExam;

public class StaticMethod {
    public static void main(String rgs[]){
        m1();
        StaticMethod st = new StaticMethod();
        st.m2();
    }
    public static void m1(){
        System.out.println("M1 static method");
    }
    public void m2(){
        System.out.println("M2 Not static method");
    }
}
