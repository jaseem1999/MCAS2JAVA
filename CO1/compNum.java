package CO1;
//write a program to  Add complex numbers
import java.util.Scanner;
class compNum {
    int real;
    int img;
    public compNum(int real, int img) {
        this.real = real;
        this.img = img;
    }
    public compNum add(compNum c1, compNum c2) {
        compNum temp = new compNum(0, 0);
        temp.real = c1.real + c2.real;
        temp.img = c1.img + c2.img;
        return temp;
    }
   @Override
    public String toString() {
        if (img < 0) {
            return real + " - " + Math.abs(img) + "i";
        }
        return real + " + " + img + "i";
    }
   
}
class MainComplex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the real and img part of first complex number: ");
        int r1 = sc.nextInt();
        int i1 = sc.nextInt();
        compNum c1 = new compNum(r1, i1);
        System.out.println("Enter the real and img part of second complex number: ");
        int r2 = sc.nextInt();
        int i2 = sc.nextInt();
        compNum c2 = new compNum(r2, i2);
        compNum temp = new compNum(0, 0);
        temp = temp.add(c1, c2);
        System.out.println("Sum of complex numbers: " + temp);
    }
}
