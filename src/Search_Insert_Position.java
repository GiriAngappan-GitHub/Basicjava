import java.util.Arrays;

import static java.util.Arrays.*;

public class Search_Insert_Position {

    public static int searchInsert(int[] nums, int target) {


        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            if(target == 0)
            {
                return 0;
            }
            if (nums[i] == target) {
                ans = i;
                return ans;
            }
            if (target > nums[nums.length - 1]) {
                return nums.length ;
            }
            for (int j = 0; i <nums.length; i++) {
                if(nums[j] == target-1)
                {
                    return ++j;
                }

            }

        }


        if(target > nums[0] && target<nums.length-1)
        {
            return 1;
        }

        return  nums[0];
    }

    public static void main(String[] args) {
        int arr[] = {3,6,7,8,10};
        System.out.println(searchInsert(arr,5));
    }
}



