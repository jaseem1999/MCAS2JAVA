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
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                b[i][j] = a[j][i];
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("The symmetric matrix is");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (a[i][j] == b[i][j]) {
                    System.out.print(a[i][j] + " ");
                } else {
                    System.out.println("The matrix is not symmetric");
                    break;
                }
            }
            System.out.println();
        }
    }
}
