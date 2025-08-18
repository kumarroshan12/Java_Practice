import java.util.*;

public class NextSmaller {
    public static int[] nextSmaller(int[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int ans[] = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() >= arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return ans;
    }

    public static void main(String args[]) {
        int arr[] = { 13, 7, 6, 12 };
        int ans[] = nextSmaller(arr);
        for (int a : ans) {
            System.out.print(a + " ");
        }
    }
}
