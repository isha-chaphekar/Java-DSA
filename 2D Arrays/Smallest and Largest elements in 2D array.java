import java.util.*;

public class Matrices {

    public static void largest_smallest (int matrix [][]){
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix [i][j] < smallest) {
                    smallest = matrix [i][j];
                }
                if (matrix [i][j] > largest) {
                    largest = matrix [i][j];
                }
            }
        }

        System.out.println("The largest element in the matrix is: " + largest);
        System.out.println("The smallest element in the matrix is: " + smallest);

    }
    
    public static void printMatrix (int matrix [][]){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix [i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int matrix [] [] = new int [3] [3];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix [i] [j] = sc.nextInt();
            }
        }

        sc.close();

        //print matrix
        printMatrix(matrix);

        //find largest and smallest
        largest_smallest(matrix);
    }
}