package Loop;

public class SumOfDigits {
    public static void main(String[] args) {
        // Write a program that asks the user to enter a number and then prints the sum
        // of all the digits in that number using a loop.

        int n = 76214;

        int sum = 0;

        while (n > 0) {
            int ld = n % 10;
            sum = sum + ld;
            n = n / 10;
        }

        System.out.println(sum);
    }
}
