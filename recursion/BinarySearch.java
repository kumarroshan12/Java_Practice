package recursion;

import java.util.*;

public class BinarySearch {

    public static int binary(int arr[], int low, int high, int target) {
        if (low > high) {
            return -1;
        }
        int mid = (low + high) / 2;
        if (arr[mid] == target)
            return mid;
        else if (target > arr[mid])
            return binary(arr, mid + 1, high, target);
        else
            return binary(arr, low, mid - 1, target);
    }

    public static void main(String args[]) {
        int arr[] = { 2, 5, 7, 9, 12, 15 };
        System.out.println(binary(arr, 0, arr.length - 1, 12));
    }

}