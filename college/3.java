package college;
// fibonacci series upto a limit
class FibonacciSeries {
    public static void main(String[] args){
        while(true){
            int n=10;
            int a=0;
            int b=1;
            int c=0;
            System.out.println(a);
            System.out.println(b);
            while(c<=n){
                c=a+b;
                System.out.println(c);
                a=b;
                b=c;
            }
            break;
        }
    }
    
}
