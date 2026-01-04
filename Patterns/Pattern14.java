package Patterns;

public class Pattern14 {
    public static void main(String[] args) {
        int n = 7;

        for (int row = 1; row <= n; row++) {
            int val = row;
            int diff = n - 1;
            for (int st = 1; st <= row; st++) {
                System.out.print(" " + val + " ");
                val += diff;
                diff--;
            }
            System.out.println();
        }
    }
}
