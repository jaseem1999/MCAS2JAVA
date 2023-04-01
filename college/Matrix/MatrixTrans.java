package college.Matrix;
import java.util.Scanner;

public class MatrixTrans {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int row = sc.nextInt();
        System.out.println("Enter the number of columns");
        int col = sc.nextInt();
        int a[][] = new int[row][col];
        int b[][] = new int[row][col];
        int failed = 0;

        if(row != col){
            System.out.println("it's not square matrix");
            failed = 1;
        }else{
            System.out.println("it's square matrix");
        }
        System.out.println("Enter the elements of the matrix");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("The matrix is");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("The transpose of the matrix is");
        if(failed == 0){
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    b[i][j] = a[j][i];
                    System.out.print(b[i][j] + " ");
                }
                System.out.println();
            }
        }else{
            System.out.println("The matrix is not square matrix");
        }
        int flag = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (a[i][j] == b[i][j]) {
                    flag = 1;
                } else {
                    flag = 0;
                    break;
                }
            }
        }
        if (flag == 1) {
            System.out.println("The matrix is symmetric");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                   System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
        }else{
            System.out.println("The matrix is not symmetric");
        }
    }
}
