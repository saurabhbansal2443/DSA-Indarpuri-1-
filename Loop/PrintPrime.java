package Loop;

public class PrintPrime {
    public static void main(String[] args) {
        // Write a programme that asks the user to enter a number and then prints all
        // the prime numbers up to that number using a loop.

        int n = 7;
        int m = 20;

        for (int i = n; i <= m; i++) {
            int ele = i;

            boolean flag = true;

            for (int j = 2; j < ele; j++) {
                if (ele % j == 0) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                System.out.println(ele);
            }
        }

    }
}
