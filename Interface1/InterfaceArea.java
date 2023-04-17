import java.util.Scanner;

interface Area{
        void area();
}

class Circle implements Area{
        Scanner sc = new Scanner(System.in);
        double pi = 3.14;
        public void area(){
                System.out.print("Enter The Radius of circle :: ");
                double r = sc.nextDouble();
                double a = pi * (r*r);
                System.out.println("Area of circle :: "+a);
        }
}

class Rectangle extends Circle implements Area{
        public void area(){
                super.area();
                System.out.print("Enter length and Breadth :: ");
                int l = sc.nextInt();
                int b = sc.nextInt();
                int a = l*b;
                System.out.println("Area of Rectangle :: "+ a);
        }
}

class Square extends Rectangle implements Area{
        public void area(){
                super.area();
                System.out.print("Enter tha Square a side :: ");
                int a = sc.nextInt();
                int an = a*a;
                System.out.println("Area of square "+ an);
        }
}

class Main1{
        public static void main(String arr[]){
                Square s = new Square();
                s.area();
        }
}
