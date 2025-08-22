import java.util.*;

public class Test {

    public static void freq(String s) {
        String words[] = s.split("\s+");

        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            map.put(words[i], map.getOrDefault(words[i], 0) + 1);
        }
        for (String str : map.keySet()) {
            if (map.get(str) > 1) {
                System.out.println(str);
            }
        }

    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        String str = "Roshan is a good boy. Roshan is good and honest Roshan";

        freq(str);
    }
}