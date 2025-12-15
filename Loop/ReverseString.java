package Loop;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello reverse me";

        String ans = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            ans = ans + ch;
        }

        System.out.println(ans);
    }
}
