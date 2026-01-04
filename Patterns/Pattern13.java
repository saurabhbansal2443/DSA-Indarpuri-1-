package Patterns;

public class Pattern13 {
    public static void main(String[] args) {
        int n = 5;
        int count = 1;

        for (int row = 1; row <= n; row++) {
            for (int st = 1; st <= row; st++) {
                System.out.print(" " + count + " ");
                count++;
            }
            System.out.println();
        }
    }
}
