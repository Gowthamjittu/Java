import java.util.Scanner;
public class matrixrotationclock {    
    public static void rotateClockwise(int[][] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0, k = N - 1; j < k; j++, k--) {
                int temp = a[i][j];
                a[i][j] = a[i][k];
                a[i][k] = temp;
            }
        }
    }
    public static void rotateCounterclockwise(int[][] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
        for (int j = 0; j < N; j++) {
            for (int i = 0, k = N - 1; i < k; i++, k--) {
                int temp = a[i][j];
                a[i][j] = a[k][j];
                a[k][j] = temp;
            }
        }
    }
    public static void printMatrix(int[][] a) {
        for (int[] row : a) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter matrix size N: ");
        int N = scanner.nextInt();
        int[][] a = new int[N][N];
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                a[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Original Matrix:");
        printMatrix(a);
        rotateClockwise(a);
        System.out.println("Matrix after 90-degree Clockwise Rotation:");
        printMatrix(a);
        rotateCounterclockwise(a);
        rotateCounterclockwise(a);
        System.out.println("Matrix after 90-degree Counterclockwise Rotation:");
        printMatrix(a);
        scanner.close();
    }
}