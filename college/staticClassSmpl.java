package college;
// sample static inner class
class staticClass {
    static int a = 10;
    static class Inner {
        public void display() {
            System.out.println("Value of a: " + a);
        }
        
    }
    
}

class staticSmpl {
    public static void Smp() {
        ys();
    }
    public static void ys() {
        System.out.println("Hello World");
    }
    
}
public  class staticClassSmpl {
    public static void main(String[] args) {
        staticClass.Inner inner = new staticClass.Inner();
        inner.display();
    }
    
}

