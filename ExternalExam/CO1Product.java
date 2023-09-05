package ExternalExam;

import java.util.Scanner;

class CO1Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many products do you want to enter?");
        int n = sc.nextInt();
        Product p[] = new Product[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Enter product code, product name, and price:");
            int pcode = sc.nextInt();
            String pname = sc.next();
            double price = sc.nextDouble();
            p[i] = new Product(pcode, pname, price);
        }
        
        // Find the product with the lowest price
        Product lowestPriceProduct = p[0];
        for (int i = 1; i < n; i++) {
            if (p[i].price < lowestPriceProduct.price) {
                lowestPriceProduct = p[i];
            }
        }
        
        System.out.println("Lowest price Product:");
        System.out.println(lowestPriceProduct.pcode + " " + lowestPriceProduct.pname + " " + lowestPriceProduct.price);
    }
}

class Product {
    int pcode;
    String pname;
    double price;
    
    Product(int pcode, String pname, double price) {
        this.pcode = pcode;
        this.pname = pname;
        this.price = price;
    }
}
