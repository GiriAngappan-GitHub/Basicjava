import java.util.Arrays;

public class Buy_two_chocolate {

        public static  int buyChoco(int[] prices, int money) {
            Arrays.sort(prices);
            int count = 0;
            int ans = 0;

            for(int i=0; i<prices.length; i++)
            {
                if(count <2)
                {
                    if(prices[i] < money)
                    {
                        ans+=prices[i];
                        count++;
                    }
                }
            }
            if(count ==2 && ans <= money)
            {
                return money-ans;
            }

            return money;
        }

    public static void main(String[] args) {
            int[] arr = {98,54,6,34,66,63,52,39};
        int ans = buyChoco(arr,62);
        System.out.println(ans);
    }
}
