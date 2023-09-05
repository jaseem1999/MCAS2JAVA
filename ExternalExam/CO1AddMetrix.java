package ExternalExam;
//Read 2 matrices from the console and perform matrix addition

import java.util.Scanner;

class MatrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row and column");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] A = new int[row][col];
        int[][] B = new int[row][col];
        System.out.println("Enter first matrix elements ::");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter second matrix elements ::");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                B[i][j] = sc.nextInt();
            }
        }
        int[][] C = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        System.out.println("Addition of two matrices ::");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

