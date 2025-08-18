
// Two Sum code
import java.util.*;

public class Twosum {
    public static int[] twosum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(arr[i], i);
        }
        return null; // No pair found
    }

    public static void main(String[] args) {
        int[] arr = { 3, 3 };
        int[] ans = twosum(arr, 6);
        if (ans != null) {
            for (int i : ans) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println("No two sum solution found.");
        }
    }
}
