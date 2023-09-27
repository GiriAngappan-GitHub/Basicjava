import java.lang.reflect.Array;
import java.util.Arrays;

public class Left_rotate {
    static void rotateArr(int arr[], int d, int n)
    {
        d=d%n;
        swap(arr,0,d-1);
        swap(arr,d,n-1);
        swap(arr,0,n-1);


    }

    public static void swap(int arr[], int s, int e)
    {
        while(s<e)
        {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }

    public static void main(String[] args) {
      int  arr[] = {40, 13, 27, 87, 95, 40, 96, 71, 35, 79, 68, 2, 98, 3, 18, 93, 53, 57, 2, 81, 87, 42, 66, 90, 45, 20, 41, 30, 32, 18, 98, 72, 82, 76, 10, 28, 68, 57, 98, 54, 87, 66, 7, 84, 20, 25, 29, 72, 33, 30, 4, 20, 71, 69, 9, 16, 41, 50, 97, 24, 19, 46, 47, 52, 22, 56, 80, 89, 65, 29, 42, 51, 94, 1, 35, 65, 25};
      rotateArr(arr,69,arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
