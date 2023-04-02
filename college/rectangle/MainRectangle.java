
package college.rectangle;
import java.util.Scanner;
class MainRectangle{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        AreaRectangle area = new AreaRectangle();
        float l, b;
        float[] areas = new float[5];
        for(int i = 0; i < 5; i++)
        {
            System.out.println("Enter the length and breadth of rectangle " + (i+1));
            l = sc.nextFloat();
            b = sc.nextFloat();
            areas[i] = area.rectangle(l, b);
        }
        float max = areas[0];
        for(int i = 1; i < 5; i++)
        {
            if(areas[i] > max)
            {
                max = areas[i];
            }2
            
        }
        System.out.println("The greatest area is " + max );


    }
}
class AreaRectangle{
    public float rectangle(float l, float b){
        return l*b;
    }
}