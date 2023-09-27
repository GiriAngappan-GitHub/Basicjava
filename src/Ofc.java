import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ofc {


    public static int[] multi (int[]arr) {
//
        int[] temp = new int[arr.length];
        int sum = 1;


        for (int i = 0; i < arr.length; i++) {
            sum = sum * arr[i];

        }

        for (int i = 0; i < temp.length; i++) {
            temp[i] = sum / arr[i];
        }



  /*
        for(int i=0,j; i<arr.length; i++)
        {
            int total = 1;
            if(i==0)
            {
                for( j=0 ;j<arr.length;j++)
                {
                    total=total*arr[i++];
                }
                i =0;
            }

            temp[i] = total/arr[i];

        }*/
        return temp;

    }


    public static void subarray(int[]a,int[]b)
    {

        ArrayList aa = new ArrayList<>();
        int a1 = a.length;
        int a2 = b.length;

        for(int i=0; i<a1 ; i++)
        {
            for (int j=0; j<a2;j++)
            {

                if(a[i] == b[j])
                {
                    int count = 1;

                    while ((i+count < a1) &&  (j+count < a2)  && (a[i+count] == b[j+count]))
                    {
                        count++;
                    }

                    if(count >1)
                    {
                        for (int x = i; x<i+count; x++)
                        {
                           // System.out.print(a[x] +" ");
                            aa.add(a[x]);
                            b[i] = -1;

                        }

                       System.out.println(aa);
                        aa.removeAll(aa);
                       // System.out.println("");
                    }
                }

            }
        }
    }

    public static void main(String[] args) {
//        int[] arr = {6,7,8,9,10};
//       int[] arr2 ={1,2,3,4,5};
//        System.out.println(Arrays.toString(multi(arr)));
//        System.out.println(".................");
//        System.out.println(Arrays.toString(multi(arr2)));
//        System.out.println("..................");

        int[]a = {9,1,2,3,10,11,8};
        int[]b = {1,2,3,11,8,9,7};
        subarray(a,b);

    }
}
