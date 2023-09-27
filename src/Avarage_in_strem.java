import java.util.Arrays;

public class Avarage_in_strem {

       static float[] streamAvg(int[] arr, int n) {
            // code here


           float[] averages = new float[n];
           int sum = 0;
           for (int i = 0; i < n; i++) {
               sum += arr[i];
               averages[i] = (float) sum / (i + 1);
           }
           return averages;
        
        }

    public static void main(String[] args) {

           int[]arr = {10,20,30,40,50};
        System.out.println(Arrays.toString(streamAvg(arr,arr.length)));
    }
    }

