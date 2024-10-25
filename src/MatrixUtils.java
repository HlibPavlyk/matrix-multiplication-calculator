import java.util.Random;
import java.util.Scanner;

public class MatrixUtils {
    private static final int MIN_RANDOM_VALUE = -10;
    private static final int MAX_RANDOM_VALUE = 10;

    public static int[][] inputMatrix(Scanner scanner, int rows, int cols) {
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            System.out.println("Enter elements for row " + (i + 1) + ":");
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        return matrix;
    }

    public static int[][] generateRandomMatrix(int rows, int cols) {
        Random random = new Random();
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(MAX_RANDOM_VALUE - MIN_RANDOM_VALUE + 1) + MIN_RANDOM_VALUE;
            }
        }

        return matrix;
    }

    public static int[][] multiplyMatrices(int[][] a, int[][] b) throws IllegalArgumentException {
        if (a == null || b == null) {
            throw new NullPointerException("Matrices must not be null.");
        }

        int rowsA = a.length;
        int colsA = a[0].length;
        int colsB = b[0].length;

        // Check that all rows in matrix A have the same length
        for (int[] row : a) {
            if (row.length != colsA) {
                throw new IllegalArgumentException("All rows in matrix A must have the same length.");
            }
        }

        // Check that all rows in matrix B have the same length
        for (int[] row : b) {
            if (row.length != colsB) {
                throw new IllegalArgumentException("All rows in matrix B must have the same length.");
            }
        }

        if (colsA != b.length) {
            throw new IllegalArgumentException("Number of columns in matrix A must equal number of rows in matrix B.");
        }

        int[][] result = new int[rowsA][colsB];

        // Perform matrix multiplication
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                int sum = 0;
                for (int k = 0; k < colsA; k++) {
                    sum += a[i][k] * b[k][j];
                }
                result[i][j] = sum;
            }
        }

        return result;
    }

    public static int calculateSumOfMinElements(int[][] matrix) {
        int sum = 0;

        for (int[] row : matrix) {
            int min = row[0];
            for (int element : row) {
                if (element < min) {
                    min = element;
                }
            }
            sum += min;
        }

        return sum;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.printf("%6d", element);
            }
            System.out.println();
        }
    }
}
