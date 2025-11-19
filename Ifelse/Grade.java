import java.util.*;

public class Grade {
    public static void main(String[] args) {
        // Write a program to input marks of five subjects Physics, Chemistry, Biology,
        // mathematics, and computer Calculate percentages and grades according to
        // following:
        // Percentage >= 90%: Grade A
        // Percentage >= 80%: Grade B
        // Percentage >= 70%: Grade C
        // Percentage >= 60%: Grade D
        // Percentage >= 40%: Grade E
        // Percentage < 40%: Grade F

        Scanner sc = new Scanner(System.in);

        int physics = sc.nextInt();
        int Chemistry = sc.nextInt();
        int bio = sc.nextInt();
        int maths = sc.nextInt();
        int cs = sc.nextInt();

        int percetage = (physics + Chemistry + bio + maths + cs) / 5;

        if (percetage >= 90) {
            System.out.println("Grade A");
        } else if (percetage >= 80) {
            System.out.println("Grade B");
        } else if (percetage >= 70) {
            System.out.println("Grade C");
        } else if (percetage >= 60) {
            System.out.println("Grade D");
        } else if (percetage >= 50) {
            System.out.println("Grade E");
        } else {
            System.out.println("Grade F");
        }

    }
}
