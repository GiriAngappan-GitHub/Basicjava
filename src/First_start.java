//Given a sorted array containing only 0s and 1s, find the transition point.

public class First_start {

    public static int transitionPoint(int arr[], int n) {
        for(int i =0; i<n; i++)
        {
            if(arr[i] !=0)
            {
                return i;
            }
        }
        return -1;
    }

    public  static  int fact(int n)
    {
        if(n == 0 || n ==1)
        {
            return n;
        }
        return  n * fact(n-1);
    }
    public static void main(String[] args) {
        int arr[] = {0,0,0,1,1};
        // System.out.println(transitionPoint(arr,arr.length));
        System.out.println(fact(5));



    }
}
