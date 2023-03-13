package college;
//print the area of a circle and rectangle using menu driven
class circle{
    public static void main(String args[])
    {
        while(true)
        {
            System.out.println("1. Area of circle");
            System.out.println("2. Area of rectangle");
            System.out.println("3. Exit");
            System.out.println("Enter your choice");
            int ch=3;
            switch(ch)
            {
                case 1:
                {
                    System.out.println("Enter the radius of the circle");
                    int r=5;
                    double area=3.14*r*r;
                    System.out.println("Area of the circle is "+area);
                    break;
                }
                case 2:
                {
                    System.out.println("Enter the length and breadth of the rectangle");
                    int l=5;
                    int b=6;
                    int area=l*b;
                    System.out.println("Area of the rectangle is "+area);
                    break;
                }
                case 3:
                {
                    System.out.println("Exiting");
                    break;
                }
                default:
                {
                    System.out.println("Invalid choice");
                }
            }
            break;
        }
    }
    
}
