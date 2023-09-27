public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int ans = 0;
        if(target == 0 )
        {
            return 0;
        }

        if(target ==0 && nums[0] < 0)
        {
            return 1;
        }

        for(int i =0; i<nums.length; i++)
        {
            if(nums[i] == target)
            {
                ans = i;
            }
        }
        if(nums[ans] == target)
        {
            return ans;
        }
        for(int i =0; i<nums.length; i++){
            if(nums[i]+1 == target) {
                ans = i + 1;
                if (ans > 0) {
                    return ans;
                }
            }
                 if(nums[i]-1 == target)
                {
                    ans = i;
                        return ans;

                }

            if(target > nums[nums.length-1])
            {
                ans = nums.length;
            }

        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr ={-1,3,5,6};
        System.out.println(searchInsert(arr,0));
    }
}
