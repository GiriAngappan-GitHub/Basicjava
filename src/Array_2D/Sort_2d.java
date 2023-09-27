package Array_2D;

public class Sort_2d {
    public static void main(String[] args) {
        int[][] matrix = {
                {5, 8, 3},
                {2, 9, 1},
                {7, 4, 6}
        };
        int n = matrix.length;
        for(int i =0; i<n; i++)
        {
            for (int j=0; j<n; j++)
            {
                for (int k=0; k<n; k++)
                {
                    for (int l = 0; l<n; l++)
                    {
                        if(matrix[i][j] > matrix[k][l])
                        {
                            int temp =matrix[i][j];
                            matrix[i][j] = matrix[k][l];
                             matrix[k][l] = temp;
                        }

                    }
                }
            }
        }


        for (int i =0 ; i<n; i++)
        {
            for (int j=0; j<matrix[i].length; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();

        }
    }



}
