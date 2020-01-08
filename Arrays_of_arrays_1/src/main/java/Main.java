import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //setting dimensions of matrix
        System.out.println("Enter matrix sizes:");
        System.out.print("m: ");
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        System.out.print("n: ");
        int n = scanner.nextInt();
        int[][] matrix = new int[m][n];

        //filling the matrix
        System.out.println("fill the matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("[" + i + ", "  + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        //choosing columns
        for (int j = 1; j < n; j += 2) {
            if (matrix[0][j] > matrix[m - 1][j]) {
                System.out.println("Column: " + j);
                for (int i = 0; i < m; i++) {
                    System.out.println(matrix[i][j]);
                }
                System.out.println("///////////////");
            }
        }
    }
}


