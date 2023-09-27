public class leet_1991 {

        public static int findMiddleIndex(int[] nums) {
            int n = nums.length;


            if(n %2 == 0)
            {
                return -1;
            }
            int s = 0;
            int e = nums.length-1;
            int mid = s+(e-s)/2;
            System.out.println(mid);

            int ans = 0;
            int count = 0;
            n -=mid+1;

            for(int i=0; i<=mid; i++)
            {
                ans+=nums[i];
                count++;
            }

            for(int j = nums.length-1; j>n; j--)
            {
                if(ans == nums[j])
                {
                    return count -1;
                }
            }



            return count;


        }

    public static void main(String[] args) {
        int []  nums = {2,3,-1,8,4};
        System.out.println(findMiddleIndex(nums));
    }
    }

