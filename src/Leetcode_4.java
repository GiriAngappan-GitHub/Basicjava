import java.util.Arrays;

public class Leetcode_4 {

        public  static double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int[] temp = new int[nums1.length+nums2.length];
            int count = 0;
            // int i = 0;
            // int j = 0;
            // int k = 0;
            // while (i < nums1.length && j < nums2.length) {
            //     if (nums1[i] < nums2[j]) {
            //         temp[k++] = nums1[i++];
            //     } else {
            //         temp[k++] = nums2[j++];
            //     }
            // }

            // while (i < nums1.length) {
            //     temp[k++] = nums1[i++];
            // }

            // while (j < nums2.length) {
            //     temp[k++] = nums2[j++];
            // }




            for(int i = 0; i<nums1.length; i++)
            {
                temp[count++] = nums1[i];
            }
            for(int j = 0; j<nums2.length; j++)
            {
                temp[count++] = nums2[j];
            }
            Arrays.sort(temp);

            int midIndex = temp.length / 2;

            if (temp.length % 2 == 0) {
                return (double) (temp[midIndex-1] + temp[midIndex]) / 2.0;
            } else {
                return (double) temp[midIndex];

            }
        }

    public static void main(String[] args) {
        int[] nums1 = {1,2}, nums2 = {3,4};
        System.out.println(findMedianSortedArrays(nums1,nums2));

    }

}
