package Patterns;

public class Pattern5 {
    public static void main(String[] args) {
        int n = 7;
        int nst = 1;

        for (int row = 1; row <= (2 * n - 1); row++) { 

            for (int st = 1; st <= nst; st++) { 
                System.out.print(" * ");
            }
            System.out.println();

            if (row < n) {
                nst++;
            } else {
                nst--;
            }
        }
    }
}
