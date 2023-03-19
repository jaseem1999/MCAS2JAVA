package college;
//Write a program to diplay a matrix read another matrix and perform matrix addition and subtraction.
class MatrixAdd {
    public static void main(String args[]) {
        int a[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
        int b[][] = { { 1, 1, 9 }, { 1, 2, 8 } };
        int c[][] = new int[2][3];
        int d[][] = new int[2][3];
        System.out.println("The first matrix is");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("The second matrix is");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("The addition of matrix is");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("The subtraction of matrix is");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                d[i][j] = a[i][j] - b[i][j];
                System.out.print(d[i][j] + " ");
            }
            System.out.println();
        }
    }
}
