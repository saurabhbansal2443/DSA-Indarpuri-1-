package Patterns;

public class Pattern15 {
    public static void main(String[] args) {
        int n = 5;

        int nst = 1;

        for (int row = 1; row <= n; row++) {
            // spaces
            for (int sp = 1; sp <= (n - row); sp++) {
                System.out.print("   ");
            }
            // Stars
            int count = 1;
            for (int st = 1; st <= nst; st++) {
                System.out.print(" " + count + " ");

                if (st < row) {
                    count++;
                } else {
                    count--;
                }
            }
            System.out.println();
            nst += 2;
        }

    }
}
