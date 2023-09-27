public class divde_divisor {
    public static void main(String[] args) {
        int dividend = 10;
        int divisor = 3;
        int result = (dividend << 0) >> countTrailingZeros(divisor);
        System.out.println(result);
    }

    public static int countTrailingZeros(int n) {
        int count = 0;
        while ((n & 1) == 0) {
            n >>= 1;
            count++;
        }
        return count;
    }


}
