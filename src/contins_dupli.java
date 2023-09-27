import java.util.HashSet;
import java.util.Set;

public class contins_dupli {
    public static boolean containsDuplicate(int[] nums) {
//        if (nums.length < 1) {
//            return false;
//        }
//
//        for (int i = 0; i < nums.length; i++) {
//
//            for (int j =i; j <nums.length-1; j++) {
//                if (nums[i] == nums[j+1]) {
//                    return true;
//                }
//
//            }
//
//
//        }
//        return false;


            Set<Integer> set = new HashSet<>();
            for (int num : nums) {
                if (set.contains(num)) {
                    return true; // If duplicate found, return true
                }
                set.add(num); // Otherwise, add the element to the hash set
            }
            return false; // If no duplicates found, return false


    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        System.out.println(containsDuplicate(a));

    }
}
