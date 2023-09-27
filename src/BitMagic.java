public class BitMagic {


        public static int bitMagic(int n, int[] arr) {
            for(int i=0; i<n; i++)
            {

                for(int j=i+2; j<n;j++)
                {

                    if(arr[i]!=arr[j])

                    {

                        if(arr[i]>arr[i+2])
                        {
                            return arr[i];
                        }
                        else
                            return arr[i+2];
                    }


                }

            }
            return 0;
        }


    public static void main(String[] args) {
        int[] arr ={1,0,1};

        System.out.println(bitMagic(arr.length,arr));
    }
}
