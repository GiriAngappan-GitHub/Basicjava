public class winnerOF_Bowling {
    public static int isWinner(int[] player1,int[] player2) {

        int sum1 = 0;
        int sum2 = 0;
        int k = 0;
        int len = player2.length;

        for(int i=0; i<player1.length; i++)
        {

            if(player1[i] == 10)
            {

                sum1+=player1[i];
                for(int j =i+1; j<=player1.length-1; j++) {
                    sum1+= player1[j] * 2;
                }break;
            }
            else if(i== player1.length-1)
            {
                sum1+=player2[i];
            }
           else
                sum1+=player1[i];
        }

        for( k=0;k<len;k++)
        {
            if(player2[k] == 10)
            {

                sum2+=player2[k];
                for(int l=k+1; l<=player2.length-1; l++) {
                    if(player2.length==player2[k] && player2[k] == 10 )
                    {
                        sum2+=10;
                        break;
                    }else
                    sum2+= player2[l] * 2;
                }
                break;
            }else if(k== player2.length-1)
                {
                    sum2+=player2[k];
                }
            else
                sum2+=player2[k];

        }
        System.out.println(sum1+" "+sum2);
        if(sum1 > sum2)
        {
            return 1;
        } else if (sum2>sum1) {
            return 2;
        } else if (sum1 == sum2 ) {
            return 0;
        }
        return -1;


    }

    public static void main(String[] args) {
        int[]a = {9,7,10,7};
        int[]b = {10,2,4,10};
        System.out.println(isWinner(a,b));
    }
}
