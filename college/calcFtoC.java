package college;
//Wap to calculate Celsius to Fahrenheit and vice versa using menu driven
import java.util.Scanner;

class  CelsiusFragment{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float celsius, fahrenheit, celsius1, fahrenheit1;
        while(true){
            System.out.println("Enter 1 to convert Celsius to Fahrenheit");
            System.out.println("Enter 2 to convert Fahrenheit to Celsius");
            System.out.println("Enter 3 to exit");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter the temperature in Celsius");
                    celsius = sc.nextFloat();
                    fahrenheit = (celsius * 9/5) + 32;
                    System.out.println("The temperature in Fahrenheit is " + fahrenheit);
                    break;
                case 2:
                    System.out.println("Enter the temperature in Fahrenheit");
                    fahrenheit1 = sc.nextFloat();
                    celsius1 = (fahrenheit1 - 32) * 5/9;
                    System.out.println("The temperature in Celsius is " + celsius1);
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
