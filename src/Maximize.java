import java.util.Arrays;

public class Maximize {
    //Maximize sum(arr[i]*i)

   static int Maximize(int arr[], int n)
    {
        // Complete the function

        Arrays.sort(arr);
        int sum=0;

        for(int i = 0,j=0; i<n; i++,j++)
        {

            sum=sum+arr[i]*j;

        }


        return sum;

    }

    public static void main(String[] args) {
        int[]a ={5,4,3,2,1};
        System.out.println(Maximize(a,a.length));
    }
}
