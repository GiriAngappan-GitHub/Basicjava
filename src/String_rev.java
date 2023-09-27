import java.util.Arrays;

public class String_rev {
    public static void rev(char[]s)
    {
        int left = 0;
        int right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }

    }



    public static void main(String[] args) {
        char[] s = {'H', 'a', 'n', 'n', 'a', 'h'};
        rev(s);
        System.out.println(Arrays.toString(s));

    }
}
