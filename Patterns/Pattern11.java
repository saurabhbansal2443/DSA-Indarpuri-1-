package Patterns;

public class Pattern11 {
    public static void main(String[] args) {
        int n = 5;

        for (int row = 1; row <= n; row++) {
            for (int st = 1; st <= row; st++) {
                System.out.print(" " + row + " ");
            }
            System.out.println();
        }
    }
}
