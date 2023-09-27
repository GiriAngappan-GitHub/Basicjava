import java.lang.reflect.Array;
import java.util.Arrays;

public class Running_sum {
    public static int[] runningSum(int[] nums) {

        int[] temp = new int[nums.length];
        int sum=0;

        for(int i=0; i<nums.length; i++)
        {
            if(i!=0)
            {
                for(int j =0; j<=i; j++)
                {
                    sum+=nums[j];
                }
            }
            else
                sum = nums[i];

            temp[i] = sum;
            sum=0;
        }

        return temp;
    }

    public static void main(String[] args) {
        int[] a =  {1,2,3,4};
        //1,3,6,10
        System.out.println(Arrays.toString(runningSum(a)));
    }
}
