//Read a matrix from the console and check whether it is symmetric or not

package ExternalExam;
import java.util.Scanner;
public class CO1metrixSymm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows and columns of the matrix");
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int[][] matrix = new int[rows][columns];
        System.out.println("Enter the elements of the matrix");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j]!= matrix[j][i]) {
                    System.out.println("The matrix is not symmetric");
                    return;
                }
            }
        }
        System.out.println("The matrix is symmetric");
        sc.close();    
    }
}
