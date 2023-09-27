package Array_2D;

public class Max_2d {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9,10,0}
        };


        int max=array[0][0];
        int min=array[0][0];

        for(int i =0;i<array.length;i++)
        {
            for(int j=0; j<array[i].length;j++)
            {
                if (max < array[i][j])
                {
                    max=array[i][j];
                }
                if(min > array[i][j])
                {
                    min = array[i][j];
                }
            }
        }

        System.out.println(max+" " +min);
    }
}
