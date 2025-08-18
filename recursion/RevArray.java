package recursion;

import java.util.*;

public class RevArray {
    public static void rev(int[] array, int s, int e) {
        if (s > e) {
            return;
        }

        int temp = array[s];
        array[s] = array[e];
        array[e] = temp;

        rev(array, s + 1, e - 1);

    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int arr[] = { 2, 6, 4, 8 };
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        rev(arr, 0, 3);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
