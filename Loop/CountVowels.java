package Loop;

public class CountVowels {
    // Write a program that asks the user to enter a sentence and then prints the
    // number of vowels in the sentence using a loop.
    public static void main(String[] args) {

        String str = "My name is Saurabh";

        int count = 0;

        int length = str.length();

        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                    || ch == 'O' || ch == 'U') {
                count++;
            }
        }

        System.out.println(count);
    }
}
