public class Score {

    public static void scores(long a[], long b[]) {
        // store the answer as
        // GFG.ca=3;
        // GFG.cb=5;
        // Your code goes here
        long x = 0;
        long y = 0;

        for(int i = 0; i<a.length; i++)
        {

            if(a[i]>b[i])
            {
                x+=1;
            }
            else if(b[i]>a[i])
            {
                y+=1;
            }


        }

        System.out.println(x+" "+y);
    }

    public static void main(String[] args) {
        long[] A = {4, 2, 7};
        long[] B = {5, 6, 3};

        scores(A,B);
    }
}
