import com.sun.jdi.PathSearchingVirtualMachine;

public class ADD_DIGIT {
    public static int addDigits(int num) {
//        if(num <=0)
//        {
//            return 0;
//
//        }
//        else if(num>0 && num<10){
//            return num;
//        }
//
//        int a = num;
//        int digit = 0;
//        int count=0;
//        int res=0;
//        while(num>0)
//        {
//            digit+= num%10;
//            num/=10;
//            if(digit>0)
//            {
//                count+=digit;
//            }
//            digit = 0;
//        }
//        while(count > 0)
//        {
//            res=res+count%10;
//            count/=10;
//        }
//        int re1 = 0;
//
//            if(res<9)
//            {
//                return  res;
//            }
//            while(res > 9)
//            {
//                re1+=res%10+res%10;
//            }
//        if(res > 9)
//        {
//            res=re1;
//        }
//        return res;

        if(num >=0 && num<9)
        {
            return num;
        }
        int count = 0;
        int digit=0;
        int res = 0;
        while(num!=0)
        {
            digit+= num%10;

            if(digit>0)
            {
                count+=digit;

            }
            else if(count > 9)
            {
                res+=count%10;
            }
            else
                digit = 0;

            num/=10;

        }
        return res;
    }



    public static void main(String[] args) {
        System.out.println(addDigits(199));
    }
}
