package group.lab_03_ex03;
import java.util.Scanner;

public class Lab_03_ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        int[][] Mat_1 = new int[3][3];
        int[][] Mat_2 = new int[3][3];

        System.out.println("Enter values for Matrix 1 (3x3):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Mat_1[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Enter values for Matrix 2 (3x3):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Mat_2[i][j] = scanner.nextInt();
            }
        }
        int[][] result1 = addMatrices(powerMatrix(Mat_1, 3), powerMatrix(Mat_2, 2));
        System.out.println("Result of (Mat_1^3) + (Mat_2^2):");
        printMatrix(result1);

        int[][] result2 = powerMatrix(subtractScalar(Mat_2, 3), 2);
        System.out.println("Result of (Mat_2 - 3)^2:");
        printMatrix(result2);

        int[][] result3 = subtractMatrices(powerMatrix(Mat_2, 5), subtractScalar(Mat_1, 2));
        System.out.println("Result of (Mat_2^5) - (Mat_1 - 2):");
        printMatrix(result3);
    }
    public static int[][] multiplyMatrices(int[][] mat1, int[][] mat2) {
        int[][] result = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    result[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }
        return result;
    }
    public static int[][] addMatrices(int[][] mat1, int[][] mat2) {
        int[][] result = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        return result;
    }
    public static int[][] subtractScalar(int[][] mat, int scalar) {
        int[][] result = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = mat[i][j] - scalar;
            }
        }
        return result;
    }
    public static int[][] subtractMatrices(int[][] mat1, int[][] mat2) {
        int[][] result = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = mat1[i][j] - mat2[i][j];
            }
        }
        return result;
    }
    public static int[][] powerMatrix(int[][] mat, int power) {
        int[][] result = new int[3][3];
        for (int i = 0; i < 3; i++) {
            result[i][i] = 1; 
        }
        for (int p = 0; p < power; p++) {
            result = multiplyMatrices(result, mat);
        }
        return result;
    }
    public static void printMatrix(int[][] mat) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
