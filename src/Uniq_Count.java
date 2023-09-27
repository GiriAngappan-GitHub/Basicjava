public class Uniq_Count {

        public  static int sumOfUnique(int[] nums) {


            for(int i=0; i<nums.length; i++)
            {

                for(int j=0; j<nums.length; j++)
                {
                    if(i != j)
                    {
                        if(  nums[i] != -1)
                        {
                            if(nums[i]==nums[j])
                            {
                                nums[i] = -1;
                                nums[j] = -1;
                            }
                        }
                    }

                 }

            }
            int sum=0;

            for(int i=0; i<nums.length; i++)
            {
                if(nums[i]!= -1)
                {
                    sum+=nums[i];
                }
            }

            return sum;


        }

    public static void main(String[] args) {
        int[]a = {1,1,1,1,1};

        System.out.println(sumOfUnique(a));

    }
    }

