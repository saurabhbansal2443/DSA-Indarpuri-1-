package Loop;

public class PowerOfNumber {
    public static void main(String[] args) {
        // Write a program to find the power of a number
        // Take two inputs.

        int n = 5;
        int x = 3;

        int pro = 1;

        while (x > 0) {
            pro = pro * n;
            x--;
        }

        System.out.println(pro);

    }
}
