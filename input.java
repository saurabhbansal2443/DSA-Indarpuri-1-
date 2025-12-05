import java.util.*;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Name");

        String name = sc.next();

        System.out.println("Enter the age of user ");

        int age = sc.nextInt();

        System.out.println("Enter the percetage ");

        double percentage = sc.nextDouble();

        System.out.println("Enter the gender");

        char gender = sc.next().charAt(0);

        System.out.println("User's name is " + name);
        System.out.println("User's age is " + age);
        System.out.println("User's percetage is " + percentage);
        System.out.println("User's gender is " + gender);
    }
}