import java.util.*;

public class IsomorphicString {
    public static String isomorphic(String s, String t) {

        for (int i = 0; i < s.length(); i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            if (ch1 != ch2)
                s.replace(ch1, ch2);
        }
        return s;

    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String str, str1;
        System.out.println("Input two string");
        str = in.nextLine();
        str1 = in.nextLine();
        isomorphic(str, str1);
        System.out.println(str);

    }
}