package Self;

class MainSynchornization {
    public static void main(String[] args) {
        Table obj = new Table();
        Thread1 t2 = new Thread1(obj);
        Thread2 t3 = new Thread2(obj);
        t2.start();
        t3.start();
    }
    
}
