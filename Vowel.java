import java.util.*;

class Vowel {

    public static String convert(String s) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                char ch1 = (char) (ch + 1);
                str.append(ch1);
            } else {
                str.append(ch);
            }
        }
        return str.toString();
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String s;
        s = in.next();
        String str = convert(s);
        System.out.println(str);
    }
}