package Patterns;

public class Pattern3 {
    public static void main(String[] args) {
        int n = 5;

        for (int row = 1; row <= n; row++) { // This is resoponsible to chnage the row
            for (int sp = 1; sp <= (n - row); sp++) {// This is responsible to print space
                System.out.print("   ");
            }
            for (int st = 1; st <= row; st++) { // This is responsible to print star
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
