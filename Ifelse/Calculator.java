public class Calculator {
    public static void main(String[] args) {
        // Write a Java program to create a simple calculator for calculating a two
        // number calculations
        int a = 10;
        char op = '+';
        int b = 20;

        if (op == '+') {
            System.out.println(a + b);
        } else if (op == '-') {
            System.out.println(a - b);
        } else if (op == '*') {
            System.out.println(a * b);
        } else if (op == '/') {
            System.out.println(a / b);
        }
    }
}
