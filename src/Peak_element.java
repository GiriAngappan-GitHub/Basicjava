public class Peak_element {

        // Function to find the peak element
        // arr[]: input array
        // n: size of array a[]
        public static int peakElement(int[] arr,int n)
        {

            int x = 0;
            int ans = 0;
            for(int i=0 ; i<n; i++)
            {
                if(arr[i]>x)
                {
                    x = arr[i];
                    ans = i;
                }
            }
            return ans;
        }
    public static void main(String[] args) {
        int arr[] = {1,13,4};
        System.out.println(peakElement(arr,3));
    }

}
