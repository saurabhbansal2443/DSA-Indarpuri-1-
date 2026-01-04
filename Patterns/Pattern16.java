package Patterns;

public class Pattern16 {
    public static void main(String[] args) {
        int n = 5;
        int rowStart = 1;

        // for (int row = 1; row <= n; row++) {
        // int print = rowStart;
        // for (int st = 1; st <= row; st++) {
        // System.out.print(" " + print + " ");
        // if (print == 1) {
        // print = 0;
        // } else {
        // print = 1;
        // }

        // }
        // System.out.println();
        // if (rowStart == 1) {
        // rowStart = 0;
        // } else {
        // rowStart = 1;
        // }

        // }

        for (int row = 1; row <= n; row++) {
            int print = 1;
            if (row % 2 == 0) {
                print = 0;
            }
            for (int st = 1; st <= row; st++) {
                System.out.print(" " + print + " ");
                if (print == 1) {
                    print = 0;
                } else {
                    print = 1;
                }

            }
            System.out.println();

        }
    }
}
