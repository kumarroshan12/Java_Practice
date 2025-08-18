import java.util.*;

public class subArray {
    public static int longestSubarraySum(int[] arr, int k) {
        int n = arr.length;
        int prefixSum[] = new int[n];

        prefixSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        int max = 0;
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (prefixSum[i] == k) {
                max = Math.max(max, i + 1);
            } else if (mp.containsKey(prefixSum[i] - k)) {
                max = Math.max(max, i - mp.get(prefixSum[i] - k));
            }

            if (!mp.containsKey(prefixSum[i])) {
                mp.put(prefixSum[i], i);
            }

        }
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N;
        System.out.println("Enter size of array");
        N = in.nextInt();
        int arr[] = new int[N];
        System.out.println("enter elements");
        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("enter number K");
        int K = in.nextInt();

        int res = longestSubarraySum(arr, K);
        System.out.println(res);

    }

}
