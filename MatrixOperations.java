import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of rows and columns for the matrices: ");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        
        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        int[][] addition = new int[rows][cols];
        int[][] subtraction = new int[rows][cols];
        int[][] multiplication = new int[rows][cols];
        
        System.out.println("Enter elements of Matrix 1:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println("Enter elements of Matrix 2:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }
        
        // Perform addition and subtraction
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                addition[i][j] = matrix1[i][j] + matrix2[i][j];
                subtraction[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        
        // Perform multiplication
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                multiplication[i][j] = 0;
                for (int k = 0; k < cols; k++) {
                    multiplication[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        
        System.out.println("Addition:");
        printMatrix(addition);
        
        System.out.println("Subtraction:");
        printMatrix(subtraction);
        
        System.out.println("Multiplication:");
        printMatrix(multiplication);
        
        scanner.close();
    }
    
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
}
