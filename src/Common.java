public class Common {
    public static void Common(int[] arr) {
        int count = 1;
        int[] temp = new int[arr.length];

        for (int i = 0; i <arr.length; i++) {

            for (int j = i + 1; j <=arr.length - 1; j++) {
                if(arr[i] == -1)
                {
                    continue;
                }
                if (arr[i] == arr[j]) {
                    arr[j] = -1;
                    temp[j] = -1;
                    count++;
                }
            }
            temp[i] = count;
            count = 1;
        }

        for (int i = 0; i < temp.length; i++) {
            if (temp[i] > 1) {
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {8,9,10,8,8,10,10,9,4,5};

        Common(arr);

    }
}
