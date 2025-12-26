package Patterns;

public class Pattern7 {
    public static void main(String[] args) {
        int n = 7;
        int nst = 1;
        int nsp = n - 1;

        // for (int row = 1; row <= n; row++) {

        // for (int sp = 1; sp <= nsp; sp++) {
        // System.out.print(" ");
        // }
        // for (int st = 1; st <= nst; st++) {
        // System.out.print(" * ");
        // }
        // System.out.println();
        // nst += 2;
        // nsp--;

        // }

        for (int row = 1; row <= n; row++) {

            for (int sp = 1; sp <= (n - row); sp++) {
                System.out.print("   ");
            }
            for (int st = 1; st <= (2 * row - 1); st++) {
                System.out.print(" * ");
            }
            System.out.println();

        }

    }
}
