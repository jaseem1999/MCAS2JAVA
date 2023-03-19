// Write a program to read a matrix and find transpose of matrix.
package college;
import java.util.Scanner;

class MatrixTranspose{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int r=sc.nextInt();
        System.out.println("Enter the number of columns");
        int c=sc.nextInt();
        int a[][]=new int[r][c];
        System.out.println("Enter the elements of matrix");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("The matrix is");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("The transpose of matrix is");
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                System.out.print(a[j][i]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}