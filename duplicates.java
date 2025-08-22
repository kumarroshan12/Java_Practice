import java.util.*;

public class duplicates {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String str;
        str = in.nextLine();

        boolean ch[] = new boolean[256];
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (!ch[str.charAt(i)]) {
                s.append(str.charAt(i));
                ch[str.charAt(i)] = true;
            }
        }
        System.out.println(s.toString());
    }
}