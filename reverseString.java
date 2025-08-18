import java.util.*;

public class reverseString {
    public static String reverse(String str) {

        String s[] = str.split(" +");
        int j = s.length - 1;
        for (int i = 0; i < s.length / 2; i++) {
            String temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            j--;
        }
        return String.join(" ", s).trim();

    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String str;
        System.out.println("Enter a sentence");
        str = in.nextLine();

        String ans = reverse(str);
        System.out.println(ans);

    }
}