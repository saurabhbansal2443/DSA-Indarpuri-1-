package Loop;

public class ReverseNumber {
    public static void main(String[] args) {
        // Write a program that takes a number from user and prints its reverse

        int n = 745231; 

         int sum = 0;

        while (n > 0) {
            int ld = n % 10;
            sum = sum*10 + ld;
            n = n / 10;
        }

        System.out.println(sum);
    }
}
