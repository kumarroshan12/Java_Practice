package recursion;

import java.util.*;

public class recursion1 {
    public static int Fact(int N) {
        if (N == 1) {
            return 1;
        }

        return N * Fact(N - 1);
    }

    public static void main(String args[]) {
        int N;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        N = in.nextInt();
        int fact = Fact(N);
        System.out.println("Sum= :" + fact);
    }
}
