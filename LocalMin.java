import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * LocalMin takes the two dimensional integer array as user input
 * and displays the local minimums
 *
 * @author Lakindu Oshadha (lakinduoshadha98@gmail.com)
 */
public class LocalMin {
    /**
     * Gives a brief introduction to user
     * Takes the array and the size of the array which is to be sorted from the user.
     *
     * @return inputArray
     * @throws IOException
     */
    static int[][] getInputMatrix() throws IOException{
        // Giving a brief Introduction to the user
        System.out.print("This program will find Local Minimums of a given Matrix.\n" + "n - " +
                "Length & width of input Matrix.\n" + "\nEnter input Matrix size(n x n): ");

        // Getting input size from user
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        // Getting the arr from the user
        int[][] arr = new int[n][n];
        int inputSize = 0;
        String input;
        for(int i = 0; i < n; i++) {
            do {
                System.out.print("Enter " + n + " integers, separated using space (n1 n2 n3 ...) for row No. "+ (i + 1) +" : ");
                input = reader.readLine();
                inputSize = input.split(" ").length;
            } while (inputSize != n);

            String[] numbers = input.split(" ");
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(numbers[j]);
            }
        }

        return arr;
    }

    /**
     * Finds & Prints local minimums of 2 dimentional arr
     *
     * @param matrix Input 2 dimentional arr
     */
    static void findLocalMins(int[][] matrix) {
        int n = matrix.length;  //Getting arr size

        System.out.print("\nLocal minimums : ");

        //Finding & Printing the local minimums
        for(int i=0; i<n;i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0 && matrix[i][j] < matrix[i][j + 1] && matrix[i][j] < matrix[i + 1][j]) {
                    System.out.print(matrix[i][j] + " ");
                } else if (i == 0 && j == n - 1 && matrix[i][j] < matrix[i][j - 1] &&
                        matrix[i][j] < matrix[i + 1][j]) {
                    System.out.print(matrix[i][j] + " ");
                } else if (i == n - 1 && j == 0 && matrix[i][j] < matrix[i - 1][j] &&
                        matrix[i][j] < matrix[i][j + 1]) {
                    System.out.print(matrix[i][j] + " ");
                } else if (i == n - 1 && j == n - 1 && matrix[i][j] < matrix[i][j - 1] &&
                        matrix[i][j] < matrix[i - 1][j]) {
                    System.out.print(matrix[i][j] + " ");
                } else if (i == 0 && j != 0 && j != n - 1 && matrix[i][j] < matrix[i][j + 1] &&
                        matrix[i][j] < matrix[i][j - 1] && matrix[i][j] < matrix[i + 1][j]) {
                    System.out.print(matrix[i][j] + " ");
                } else if (j == 0 && i != 0 && i != n - 1 && matrix[i][j] < matrix[i - 1][j] &&
                        matrix[i][j] < matrix[i + 1][j] && matrix[i][j] < matrix[i][j + 1]) {
                    System.out.print(matrix[i][j] + " ");
                } else if (i == n - 1 && j != 0 && j != n - 1 && matrix[i][j] < matrix[i][j + 1] &&
                        matrix[i][j] < matrix[i][j - 1] && matrix[i][j] < matrix[i - 1][j]) {
                    System.out.print(matrix[i][j] + " ");
                } else if (j == n - 1 && i != 0 && i != n - 1 && matrix[i][j] < matrix[i - 1][j]  &&
                        matrix[i][j] < matrix[i + 1][j]&& matrix[i][j] < matrix[i][j - 1]) {
                    System.out.print(matrix[i][j] + " ");
                } else if (j != 0 && j != n - 1 && i != 0 && i != n - 1 && matrix[i][j] < matrix[i + 1][j] &&
                        matrix[i][j] < matrix[i][j + 1] && matrix[i][j] < matrix[i - 1][j] &&
                        matrix[i][j] < matrix[i][j - 1]) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
        System.out.println();

    }

    /**
     * main
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {

        int[][] matrix = getInputMatrix();  // Getting the array from the user
        findLocalMins(matrix);     //Finding & Printing local minimums
    }

}
