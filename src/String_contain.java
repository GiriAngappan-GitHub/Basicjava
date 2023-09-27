public class String_contain {


    static boolean  isBinary(String str)
    {

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c != '0' && c != '1') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "0111100110101100";


        System.out.println( isBinary(str));

    }
}
