import java.util.Arrays;

public class Merge {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[m+n];
        int index = 0;
        for(int i=0;i< nums1.length;i++)
        {
            if(nums1[i] == 0)
            {
                continue;
            }
            temp[index++] = nums1[i];
        }
        for(int i=0;i<nums2.length;i++)
        {
            if(nums2[i] == 0)
            {
                continue;
            }
            temp[index++] = nums2[i];
        }
        Arrays.sort(temp);

        System.out.println(Arrays.toString(temp));

    }

    public static void main(String[] args) {
        int[]a = {0};
        int[]b = {1};
        merge(a,0,b,1);
    }
}
