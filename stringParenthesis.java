import java.util.*;

public class stringParenthesis {
    public static String concat(String s) {
        int opening = 0, closing = 0, j = 0;
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(')
                opening++;
            else if (ch == ')')
                closing++;

            if (opening == closing) {
                str = str + s.substring(j + 1, i);
                j = i + 1;
            }
        }

        return str;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String str;
        System.out.println("Enter the string");
        str = in.nextLine();
        String ans = concat(str);
        System.out.println(ans);
    }
}