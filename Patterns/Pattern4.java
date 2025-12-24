package Patterns;

public class Pattern4 {
    public static void main(String[] args) {
        int n = 7;

        for (int row = 1; row <= n; row++) { // This is resoponsible to chnage the row
            for (int sp = 1; sp <= (row - 1); sp++) {// This is responsible to print space
                System.out.print("   ");
            }
            for (int st = 1; st <= (n + 1 - row); st++) { // This is responsible to print star
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
