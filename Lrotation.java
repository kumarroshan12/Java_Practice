import java.util.*;

public class Lrotation {
    public static void reverse(int[] arr, int start, int end) {
        int temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;

        }
    }

    public static void rotatebyd(int arr[], int d) {
        int N = arr.length;
        reverse(arr, 0, N - 1);
        reverse(arr, 0, d);
        reverse(arr, d + 1, N - 1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size, d;
        System.out.println("Enter size of array");
        size = in.nextInt();
        int org[] = new int[size];
        System.out.println("Enter elements into array");
        for (int i = 0; i < size; i++) {
            org[i] = in.nextInt();
        }
        System.out.println("Enter the left rotation d :");
        d = in.nextInt();

        rotatebyd(org, d);
        for (int i = 0; i < size; i++) {
            System.out.print(org[i] + " ");
        }
    }

}