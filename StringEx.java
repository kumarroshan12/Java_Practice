import java.util.*;

public class StringEx {

    public static String transformations(String str) {

        StringBuilder s = new StringBuilder(str);
        s.reverse();
        return s.toString();

        /*
         * char arr[] = str.toCharArray();
         * for (int i = 0; i < arr.length / 2; i++) {
         * char temp = arr[i];
         * arr[i] = arr[arr.length - 1 - i];
         * arr[arr.length - 1 - i] = temp;
         * }
         * return new String(arr);
         */
    }

    public static void main(String args[]) {
        String str = transformations("roshan");
        System.out.println(str);
    }

}