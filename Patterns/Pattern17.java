package Patterns;

public class Pattern17 {
    public static void main(String[] args) {
        int n = 5;

        // for (int row = 1; row <= n; row++) {
        // for (int st = 1; st <= n; st++) {
        // System.out.print(" * ");
        // }
        // System.out.println();
        // }

        // for (int row = 1; row <= n; row++) {
        // for (int col = 1; col <= n; col++) {
        // if (row == 1 || row == n || col == 1 || col == n) {
        // System.out.print(" * ");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // for (int row = 1; row <= n; row++) {
        // for (int col = 1; col <= n; col++) {
        // if (row == col || row + col == n + 1) {
        // System.out.print(" * ");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (row == 1 || row == n / 2 + 1 || row == n || (col == 1 && row <= n / 2 + 1)
                        || (col == n && row >= n / 2 + 1)) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
