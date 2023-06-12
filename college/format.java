import java.util.Scanner;

class MainBill{
        public static void main(String arr[]){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter rows :: ");
                int row = sc.nextInt();
                Bill b[] = new Bill[row];
                System.out.println("Enter date :: (day/month/year) :: ");
                String date = sc.next();

                for(int i = 0; i < row; i++){
                        System.out.print("Enter Name :: ");
                        String name = sc.next();
                        System.out.print("Enter Product Id ::");
                        int pid = sc.nextInt();
                        System.out.print("Enter Product Quandity ::");
                        int qt = sc.nextInt();
                        System.out.print("Enter Product Unit price ::");
                        int up = sc.nextInt();
                        int total = qt * up;
                        b[i] = new Bill(name,pid,qt,up,total);
                }
                int price = 0;
                System.out.println("Date : "+ date);
                System.out.println("Product id  Name  Quandity  UnitPrice  Total");
                 System.out.println("---------------------------------------------");

                for(int i =0 ; i < row; i++){
                        System.out.println("     "+b[i].pid +"       "+b[i].name+"      "+b[i].qt+"         "+b[i].up+"      "+b[i].total);
                        price = price + b[i].total;

                }
                 System.out.println("---------------------------------------------");

                System.out.println("                                    Total price"+price);


        }
}
class Bill{
        String date,name;
        int pid,qt,up,total;
        public Bill(String name,int pid,int qt,int up,int total ){
                this.name = name;
                this.pid = pid;
                this.qt = qt;
                this.up= up;
                this.total=total;
        }
                     