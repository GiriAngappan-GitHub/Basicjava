import java.lang.reflect.Array;
import java.util.Arrays;

public class Plus_one {
    public static int[] plusOne(int[] digits) {

    int n = digits.length;
    int carry = 1;

    for (int i = n - 1; i >= 0; i--) {
        int sum = digits[i] + carry;
        if (sum > 9) {
            digits[i] = 0;
            carry = 1;
        } else {
            digits[i] = sum;
            carry = 0;
        }
    }

    if (carry == 1) {
        int[] res = new int[n + 1];
        res[0] = 1;
        return res;
    }

    return digits;

    }

    public static void main(String[] args) {
        int[] arr ={9,9,9};

        System.out.println(Arrays.toString(plusOne(arr)));

    }
}
