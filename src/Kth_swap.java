public class Kth_swap {
   static void swapKth(int arr[], int n, int k) {

        //int[] temp = new int[n];
        swap(arr,k-1,arr.length-k);

        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }


    }

  static  void swap(int arr[], int s, int e)
    {

        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        swapKth(arr,8,3);
    }
}
