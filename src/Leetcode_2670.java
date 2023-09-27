import java.util.Arrays;

public class Leetcode_2670 {


        public static int[] distinctDifferenceArray(int[] nums) {
            int[] ans = new int[nums.length];
            int prefix = 0;
            int sufix = 1;
            int n = nums.length;
            int k = 0;

            for(int i=0; i<n;i++)
            {
                k = i;
                for(int j=i+1;i<=n-1; i++) {

                    if (i != n - 1) {

                        if (nums[i] != nums[j]) {
                            prefix++;
                        }

                    }

                    while(i == n-1 && k >0)
                    {
                        if(nums[k] != nums[k-1])
                        {
                            sufix++;
                        }
                        k--;
                    }

                    if(i != 0)
                    {
                        if(nums[k] != nums[k-1])
                        {
                            sufix++;
                        }
                    }
                    else
                        sufix = 1;
                    k++;

                }

                ans[i] = prefix - sufix;
                k = 0;
            }
            return ans;
        }

        public static void main(String[] args) {
            int [] a = {3,2,3,4,2};
            System.out.println(Arrays.toString(distinctDifferenceArray(a)));
        }



}
