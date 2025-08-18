import java.util.*;

public class Revstringodd {
    public static String reverse(String str) {
        StringBuilder s = new StringBuilder(str);
        s.reverse();
        return s.toString();
    }

    public static String revodd(String str) {
        String arr[] = str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            int len = arr[i].length();
            if (len % 2 != 0) {
                String word = reverse(arr[i]);

                arr[i] = word;

            }
        }
        return String.join(" ", arr);
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String str = revodd("We met in std 9th that was not just coincidence it was a blessing");
        System.out.println(str);
    }
}