import java.util.ArrayList;
import java.util.Arrays;

public class Ofc_2 {

    public static void Subarry(int[]a, int[]b)
    {
//
//        ArrayList aa = new ArrayList();
//                int n = a.length;
//                int n2 = b.length;
//
//                for (int i = 0; i < n; i++)
//                {
//                    for (int j = 0; j < n2; j++)
//                    {
//
//                        if (a[i] == b[j])
//                        {
//                            int len = 1;
//
//                            while ( i + len < n && j + len < n2 &&a[i + len] == b[j + len])
//                            {
//                                len++;
//                            }
//
//
//                            if (len > 1) {
//
//                                for (int k = i; k < i+ len; k++) {
//                                   // System.out.print(a[k] + " ");
//                                    aa.add(a[k]);
//                                    b[i] = -1;
//                                }
//                                if(aa != null)
//                                {
//                                    System.out.println(aa);
//                                }
//                               aa.removeAll(aa);
//                                System.out.println();
//
//                            }
//                        }
//                    }

//                }
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
                            aa.add(a[x]);
                            b[i] = -1;
                        }
                        System.out.println(aa);

                        aa.removeAll(aa);
                        System.out.println();
                    }
                }

            }
        }

            }




    public static void main(String[] args) {

        int[]a = {9,1,2,3,10,11,8};
        int[]b = {1,2,3,11,8,9,7};
        Subarry(a,b);

    }
}
