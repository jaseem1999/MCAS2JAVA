package college;

import java.util.Scanner;

class Except1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
       int ch = 0;
        do{
            ch = sc.nextInt();
            switch(ch){
                case 1 :
                    System.out.print("case 1 ");
                    break;
                case 2 :
                    System.out.print("case 2 ");
                    break;
                case 3 :
                    System.out.print("case 3 ");
                    break;
                case 4 :
                    System.out.print("case 4 exit ");
                    break;
                default :
                    System.out.print("invalid ");
                    break;
            }
        }while(ch != 4);
        
    }
}