public class CheckVowel {
    public static void main(String[] args) {
        // Write a program to input any alphabet and check whether it is vowel or
        // consonant

        char ch = 'A';

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                || ch == 'O' || ch == 'U') {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }
    }
}
