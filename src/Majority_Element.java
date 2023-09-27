import java.util.Arrays;

public class Majority_Element {
   public static int majorityElement(int a[], int size)
   {
//        int[] temp = new int[size];
//        int count = 1;
//
//
//        for(int i=0; i<size; i++)
//        {
//
//            for(int j =i+1; j<size-1;j++)
//            {
//                if(a[i] != -101)
//                {
//                    if(a[i] == a[j])
//                    {
//                        count++;
//                        a[j] = -101;
//                    }
//
//                }
//
//
//
//            }
//            temp[i] = count;
//            count = 0;
//        }
//
//        int max = Integer.MIN_VALUE ;
//
//        for(int i = 0; i<temp.length; i++)
//        {
//         if(max < temp[i])
//         {
//             max = temp[i];
//         }
//        }
////
////        if(max > size/2)
////        {
////            return  max;
////        }
//        return  -1;

         Arrays.sort(a);
        return a[a.length/2];
    }

    public static void main(String[] args) {
        int A[] = {6,6,5,5,6};
        System.out.println(majorityElement(A,A.length));
    }
}
