package college.Co;
//write a program to  Add complex numbers
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
        compNum c1 = new compNum(2, 3);
        compNum c2 = new compNum(4,-5);
        compNum temp = new compNum(0, 0);
        temp = temp.add(c1, c2);
        System.out.println("Sum of complex numbers: " + temp);
    }
}
