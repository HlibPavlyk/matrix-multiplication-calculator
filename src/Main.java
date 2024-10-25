import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] matrixA;
        int[][] matrixB;
        int[][] matrixC;

        try (Scanner scanner = new Scanner(System.in)) {
            // Choose option for Matrix A
            System.out.println("Select an option for Matrix A:");
            System.out.println("1 - Enter manually");
            System.out.println("2 - Generate randomly");
            int choiceA = scanner.nextInt();

            int rowsA;
            int colsA;

            if (choiceA == 1) {
                System.out.println("Enter dimensions of Matrix A (rows and columns):");
                rowsA = scanner.nextInt();
                colsA = scanner.nextInt();
                System.out.println("Enter elements of Matrix A:");
                matrixA = MatrixUtils.inputMatrix(scanner, rowsA, colsA);
            } else {
                System.out.println("Enter dimensions of Matrix A to generate (rows and columns):");
                rowsA = scanner.nextInt();
                colsA = scanner.nextInt();
                matrixA = MatrixUtils.generateRandomMatrix(rowsA, colsA);
                System.out.println("Generated Matrix A:");
                MatrixUtils.printMatrix(matrixA);
            }

            // Choose option for Matrix B
            System.out.println("Select an option for Matrix B:");
            System.out.println("1 - Enter manually");
            System.out.println("2 - Generate randomly");
            int choiceB = scanner.nextInt();

            int rowsB;
            int colsB;

            if (choiceB == 1) {
                System.out.println("Enter dimensions of Matrix B (rows and columns):");
                rowsB = scanner.nextInt();
                colsB = scanner.nextInt();
                System.out.println("Enter elements of Matrix B:");
                matrixB = MatrixUtils.inputMatrix(scanner, rowsB, colsB);
            } else {
                System.out.println("Enter dimensions of Matrix B to generate (rows and columns):");
                rowsB = scanner.nextInt();
                colsB = scanner.nextInt();
                matrixB = MatrixUtils.generateRandomMatrix(rowsB, colsB);
                System.out.println("Generated Matrix B:");
                MatrixUtils.printMatrix(matrixB);
            }

            // Multiply matrices A and B
            matrixC = MatrixUtils.multiplyMatrices(matrixA, matrixB);

            // Display result of multiplication
            System.out.println("Matrix C (Result of A * B):");
            MatrixUtils.printMatrix(matrixC);

            // Calculate sum of smallest elements in each row of Matrix C
            int sumOfMinElements = MatrixUtils.calculateSumOfMinElements(matrixC);
            System.out.println("Sum of the smallest elements of each row in Matrix C: " + sumOfMinElements);

        } catch (Exception e) {
            System.err.println("An error occurred during matrix operations: " + e.getMessage());
        }
    }
}