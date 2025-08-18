import java.util.*;

public class distMax {
    public static int max(String str) {
        Map<Character, ArrayList<Integer>> map = new HashMap<>();
        int i = 0;
        for (char ch : str.toCharArray()) {
            map.putIfAbsent(ch, new ArrayList<>());
            map.get(ch).add(i);
            i++;
        }
        int ans = 0;
        for (char ch : map.keySet()) {
            ArrayList<Integer> arr = map.get(ch);
            int max = arr.getLast() - arr.getFirst();
            ans = Math.max(ans, max);
        }
        return ans - 1;
    }

    public static void main(String args[]) {
        String s = "aabcdfaghfvcd";
        int ans = max(s);
        System.out.println(ans);
    }
}