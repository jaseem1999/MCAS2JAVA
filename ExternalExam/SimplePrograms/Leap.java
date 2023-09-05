package ExternalExam.SimplePrograms;

public class Leap {
    public static void main(String[] args) {
        System.out.println("Leap year :: "+isLeapYear(2000));
        System.out.println("Leap year :: "+isLeapYear(2001));
        System.out.println("Leap year :: "+isLeapYear(2002));
        System.out.println("Leap year :: "+isLeapYear(2003));
        System.out.println("Leap year :: "+isLeapYear(2004));
        System.out.println("Leap year :: "+isLeapYear(2005));
        System.out.println("Leap year :: "+isLeapYear(2006));
        System.out.println("Leap year :: "+isLeapYear(2007));
        System.out.println("Leap year :: "+isLeapYear(2008));
        System.out.println("Leap year :: "+isLeapYear(2009));
        System.out.println("Leap year :: "+isLeapYear(2010));
    }
    public static boolean isLeapYear(int year) {
        return (year % 100 != 0 && year % 4 == 0) || (year % 400 == 0);
    }
}
