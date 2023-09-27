public class Leet_2656 {

        public static int maximizeSum(int[] nums, int k)
        {
            int ans = nums[nums.length-1];
            int num = ans;
            for(int i =1 ; i<=k;i++)
            {

                if(i == 1 )
                {
                    ans = ans;
                }
                else
                {
                    ans += num+1;
                    num +=1;
                }

            }

            return ans;
        }

    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5};
        int k = 3;
        System.out.println(maximizeSum(nums,k));
    }
}
