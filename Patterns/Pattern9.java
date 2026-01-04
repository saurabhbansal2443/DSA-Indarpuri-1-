package Patterns;

public class Pattern9 {
    public static void main(String[] args) {
        int n = 7;
        int nst = 2 * n - 1;
        int nsp = 0;

        for (int row = 1; row <= n; row++) {

            for (int sp = 1; sp <= nsp; sp++) {
                System.out.print("   ");
            }
            for (int st = 1; st <= nst; st++) {
                System.out.print(" * ");
            }
            System.out.println();
            nst -= 2;
            nsp++;
        }

    }
}
