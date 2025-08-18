import java.util.*;

public class codeproblem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        int countOnes = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (a[i] == 1)
                countOnes++;
        }

        // Edge case: all 1s → must flip at least one → max 1s = n-1
        if (countOnes == n) {
            System.out.println(n - 1);
            return;
        }

        int maxGain = Integer.MIN_VALUE;
        int currentGain = 0;

        for (int i = 0; i < n; i++) {
            int gain = (a[i] == 0) ? 1 : -1;
            currentGain = Math.max(gain, currentGain + gain);
            maxGain = Math.max(maxGain, currentGain);
        }

        System.out.println(countOnes + maxGain);
    }
}
