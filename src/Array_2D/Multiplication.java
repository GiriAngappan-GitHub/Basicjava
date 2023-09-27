package Array_2D;

public class Multiplication {

        public static void main(String[] args) {
            int[][] matrix1 = {
                    {1, 2, 3},
                    {4, 5, 6}
            };

            int[][] matrix2 = {
                    {10, 11},
                    {12, 13},
                    {14, 15}
            };

            int rows1 = matrix1.length;
            System.out.println(rows1);
            int columns1 = matrix1[0].length;
            System.out.println(columns1);
            int rows2 = matrix2.length;
            System.out.println(rows2);
            int columns2 = matrix2[0].length;
            System.out.println(columns2);

            if (columns1 != rows2) {
                System.out.println("Matrix multiplication is not possible.");
                return;
            }

            int[][] result = new int[rows1][columns2];

            // Perform matrix multiplication
            for (int i = 0; i <rows1; i++) {
                for (int j = 0; j <columns2; j++) {
                    for (int k = 0; k < columns1; k++) {
                        result[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }


            System.out.println("Result Matrix:");
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < columns2; j++) {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        }


}
