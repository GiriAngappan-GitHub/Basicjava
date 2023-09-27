import java.lang.reflect.Array;
import java.util.Arrays;

public class SmallerThan_currentNUm {
    public static int[] smallerNumbersThanCurrent(int[] nums) {

        int[] temp = new int[nums.length];

        int count =0;


        for(int i=0; i<nums.length; i++)
        {
            for(int j = 0; j<nums.length-1; j++)
            {
                if(nums[i] > nums[j])
                {
                    count++;
                }


            }

            temp[i] = count;
            count = 0;

        }

        return temp;

    }

    public static void main(String[] args) {
        int[] a = {6,5,4,8};

        System.out.println(Arrays.toString(smallerNumbersThanCurrent(a)) );
    }
}
