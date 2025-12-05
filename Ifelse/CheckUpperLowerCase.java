public class CheckUpperLowerCase {
    public static void main(String[] args) {
        // Write a program to check whether a character is uppercase or lowercase.

        char ch = 'B';

        // int asciiVal = (int) (ch); // Type conversion
        // System.out.println(asciiVal);
        // if (asciiVal >= 97 && asciiVal <= 122) {
        // System.out.println("LowerCase");
        // } else if (asciiVal >= 65 && asciiVal <= 90) {
        // System.out.println("UpperCase");
        // }

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("LowerCase");
        } else if (ch >= 'A' && ch <= 'z') {
            System.out.println("UpperCase");
        }

    }
}
