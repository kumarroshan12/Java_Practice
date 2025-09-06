import java.util.*;

class subsequences {

    public static void subsequence(int ind, ArrayList<Integer> arr, int a[]) {
        if (ind == a.length) {
            if (arr.size() > 0) {
                for (int num : arr) {
                    System.out.print(num + "");
                }
            } else {
                System.out.print("{}");
            }
            System.out.println();
            return;
        }
        arr.add(a[ind]);
        subsequence(ind + 1, arr, a);
        arr.remove(arr.size() - 1);
        subsequence(ind + 1, arr, a);
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int arr[] = { 3, 1, 2 };
        ArrayList<Integer> ar = new ArrayList<>();
        subsequence(0, ar, arr);
    }
}