import java.util.*;

public class CountFreq {
    public static HashMap<Integer, Integer> countFreq(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {

            map.put(arr[i], (map.getOrDefault(arr[i], 0) + 1));

        }
        return map;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length of an array : ");
        int N;

        N = in.nextInt();
        int arr[] = new int[N];
        System.out.println("Enter elements into array");
        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }
        HashMap<Integer, Integer> mp = countFreq(arr);
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

    }
}