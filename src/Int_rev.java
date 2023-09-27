public class Int_rev {
    public static int reverse(int x) {
        int org = x;
        int ans = 0;
        while(x != 0)
        {
            if(x < 0)
            {
                x = -(x);
            }
            ans=ans*10 +x%10;
            x/=10;

        }
        if(org < 0)
        {
            return -(ans);
        }

        return ans;
    }

    public static void main(String[] args) {
        int x = -2147483648;

        System.out.println(reverse(x));
    }
}
