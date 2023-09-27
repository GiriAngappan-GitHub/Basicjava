package Array_2D;

import java.util.Arrays;

public class TransposeMatrix {

        public static void main(String[] args) {
            int[][] matrix = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };

            int rows = matrix.length;
            int columns = matrix[0].length;

            int[][] transpose = new int[columns][rows];




            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    transpose[j][i] = matrix[i][j];
                }
            }

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                 // transpose[j][i] = matrix[i][j];
                    System.out.print(matrix[j][i] + " ");
                }
                System.out.println();
            }
            System.out.println("    ");


            System.out.println("Transposed Matrix:");
            for (int i = 0; i < rows; i++)
            {
                for (int j = 0; j < columns; j++)
                {
                    System.out.print(transpose[i][j] + " ");
                }
                System.out.println();
            }

        }

}
