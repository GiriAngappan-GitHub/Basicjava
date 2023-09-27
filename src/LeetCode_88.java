import java.util.Arrays;

public class LeetCode_88 {

        public static void merge(int[] nums1, int m, int[] nums2, int n) {


            for(int i=0; i<n; i++){
                nums1[m++] = nums2[i];
            }

            Arrays.sort(nums1);



        }

    public static void main(String[] args) {
      int[]  nums1 = {};
      int m = 0, n = 1;
       int[] nums2 = {1};

       merge(nums1,m,nums2,n);


        }
 }

