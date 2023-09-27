import java.util.ArrayList;

public class Subarray_withsum {




        //Function to find a continuous sub-array which adds up to a given number.
        static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
        {

            ArrayList<Integer> a = new ArrayList<Integer>();
            int sum = 0;

            for(int i=0; i<n;i++)
            {
                sum+=arr[i];

                if(sum == s)
                {
                    for(int j=1; j<=i; j++)
                    {
                        a.add(j);
                    }
                    if(a != null)
                    {
                        return a;
                    }
                }
            }


            if(a == null)
            {
                a.add(-1);
            }
            return a;
        }


    public static void main(String[] args) {

        int[]A = {1,2,3,7,5};

        System.out.println(subarraySum(A,A.length,12));

    }
    }


