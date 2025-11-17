package Ifelse;

import java.util.*;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        // Write a program to check whether a number is negative, positive or zero
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n > 0) {
            System.out.println("Positive");
        } else if (n < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }
}
