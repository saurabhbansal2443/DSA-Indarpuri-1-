package Functions;

public class basic {
    public static void main(String[] args) {
        int ans = factorial(5);

        System.out.println(ans);
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        int ans = 1;
        for (int i = 2; i <= n; i++) {
            ans *= i;
        }

        return ans;

    }

    public static String reverseString(String str) {
        String ans = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            ans = ans + ch;
        }

        return ans;
    }

    public static boolean isArmStrong(int n) {
        int sum = 0;
        int ogData = n;

        while (n > 0) {
            int ld = n % 10;
            sum = sum + ld * ld * ld;
            n = n / 10;
        }

        if (sum == ogData) {
            return true;
        } else {
            return false;
        }
    }

    public static int findPower(int n , int x){
        
    }
}
