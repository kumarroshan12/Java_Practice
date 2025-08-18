package recursion;

import java.util.*;

public class maxInWindow {
    public static ArrayList<Integer> max(int arr[], int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length - k + 1; i++) {
            int max = -1;

            for (int j = i; j < k + i; j++) {
                if (arr[j] > max)
                    max = arr[j];

            }
            list.add(max);
        }
        return list;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int arr[] = { 2, 4, 8, 5, 9, 2, 3, 5, 6 };
        ArrayList<Integer> ans = max(arr, 4);
        for (int i : ans) {
            System.out.println(i);
        }
    }
}