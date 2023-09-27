import java.util.HashSet;

public class Key_pair {
     static boolean hasArrayTwoCandidates(int arr[], int n, int x) {


         HashSet<Integer> set = new HashSet<>();

         for (int i = 0; i < n; i++) {
             int complement = x - arr[i];
             if (set.contains(complement)) {
                 System.out.println(set);
                 return true;
             }
             set.add(arr[i]);
         }


         return false;

    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 45, 6, 10, 8};
        System.out.println(hasArrayTwoCandidates(arr,6,16));
    }
}
