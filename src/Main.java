import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Create a 2x3 matrix
        int[][] matrix = new int[2][3];

        Random random = new Random();

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = random.nextInt(101);  // Generate a random integer between 0 and 100 for matrix
            }
        }

        // Print the original matrix
        System.out.println("Original Matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        // Print the transpose of the matrix
        System.out.println("\nTransposed Matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrix[j][i] + "\t");
            }
            System.out.println();
        }
    }
}
