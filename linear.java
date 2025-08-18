import java.util.*;

public class linear {
    public static boolean linearSearch(int[] arr, int k) {
        boolean sol = false;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == k) {
                sol = true;

            }
        }
        return sol;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N, k;

        System.out.println("Enter size");
        N = in.nextInt();
        int[] arr = new int[N];
        System.out.println("Enter elements");
        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Enter item to search");
        k = in.nextInt();
        boolean res = linearSearch(arr, k);
        System.out.println(res);
    }
}
