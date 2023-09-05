package ExternalExam;
class CO1AddComplex {
    public static void main(String[] args) {
        complex c1 = new complex(1, 2);
        complex c2 = new complex(3,-4);
        complex c3 = c1.add(c1,c2);
        System.out.println(c3);
    }    
}

class complex{
    int real;
    int img;
    complex(int r,int i){
        real=r;
        img=i;
    }
    public complex add(complex c1, complex c2) {
        complex temp = new complex(0, 0);
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
