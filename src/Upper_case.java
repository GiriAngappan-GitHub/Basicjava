public class Upper_case {
    public static  String transform(String s)
    {
        // code here
        char[] ch=s.toCharArray();
        ch[0]=Character.toUpperCase(ch[0]);

        for(int i=1; i<s.length()-1; i++){
            if(ch[i]==' '){
                ch[i+1]=Character.toUpperCase(ch[i+1]);
            }
        }

        return new String(ch);
    }

    public static void main(String[] args) {

    }
}
