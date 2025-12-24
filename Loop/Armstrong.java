package Loop;

public class Armstrong {
    public static void main(String[] args) {
        // Write a program that asks the user to enter a number and then prints whether
        // it is an Armstrong number or not using a loop.

        int n = 153;

        int sum = 0;
        int ogData = n;

        while (n > 0) {
            int ld = n % 10;
            sum = sum + ld * ld * ld;
            n = n / 10;
        }

        if (sum == ogData) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not armstrong");
        }
    }
}
