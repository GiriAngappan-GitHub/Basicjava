import java.util.Arrays;

public class Single_Num {
    public static  int singleNumber(int[] nums) {
        if(nums.length<= 1)
        {
            return nums[0];
        }
        int temp[] = new int[nums.length];

        for(int i=0; i<nums.length; i++)
        {
            for(int j =i+1; j<nums.length; j++)
            {
                if(nums[i] == nums[j])
                {
                  temp[j] = -1;
                  temp[i] = -1;
                }
            }

        }
        for (int i = 0; i < temp.length ; i++) {
            if(temp[i] == 0)
            {
                return nums[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] a = {2,2,1};


        System.out.println(singleNumber(a));
    }
}
