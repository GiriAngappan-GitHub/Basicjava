import java.util.ArrayList;

public   class Index_value {
   public static ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
       ArrayList<Integer> result = new ArrayList<Integer>();
       for (int i = 1; i <arr.length; i++) {
           if (arr[i] != i) {
               result.add(i);
           }
       }
       return result;
        }

    public static void main(String[] args) {
        int[] a = {15 ,2 ,45 ,12 ,7};
        System.out.println(valueEqualToIndex(a,5));
    }
    }

