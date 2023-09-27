public class Amstrong_num {
    public static String armstrongNumber(int n){
        int r = 0;
        int ams = 0;
        int org_num = n;

        while(n!=0)
        {
            r=n%10;
            n/=10;
            ams+=r*r*r;
        }
        if(org_num == ams)
        {
            return "Yes";
        }
        return "NO";
    }

    public static void main(String[] args) {
        System.out.println(armstrongNumber(153));
    }
}
