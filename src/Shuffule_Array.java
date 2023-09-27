import java.util.Arrays;

public class Shuffule_Array {
    public static int[] shuffle(int[] nums, int n) {

        int[] temp = new int[nums.length];
        int j=0;

        for(int i=0; i<n; i++) {
            {
                temp[j] = nums[i];
                j += 2;

            }
        }
        for(int k =1; k<=nums.length-1; k+=2)
        {
            temp[k] = nums[n++];
        }

        return temp;


    }

    public static void main(String[] args) {
        int[]a = {2,5,1,3,4,7};
        System.out.println(Arrays.toString(shuffle(a,3)));

    }
}
