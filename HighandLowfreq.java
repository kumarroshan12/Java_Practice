import java.util.*;

class HighandLowfreq {
    public static int[] calc(int arr[]) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        int max = 0, min = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (hash.containsKey(arr[i])) {
                hash.get(arr[i]) = hash.get(arr[i]) + 1;
            }

        }
    }
}