package college;
// WAP to check whether a number is Armstrom 
class Armstrong{
    public static void main(String args[])
    {
        int n=153;
        int sum=0;
        int temp=n;
        while(temp!=0)
        {
            int r=temp%10;
            sum=sum+r*r*r;
            temp=temp/10;
        }
        if(sum==n)
        {
            System.out.println("Armstrong number");
        }
        else
        {
            System.out.println("Not an Armstrong number");
        }
    }
}
