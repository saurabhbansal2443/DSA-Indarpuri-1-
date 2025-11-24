public class CheckTriangle {
    public static void main(String[] args) {
        // Write a program to check whether the triangle is equilateral, isosceles or
        // scalene triangle

        int a = 10;
        int b = 20;
        int c = 10;

        if (a == b) { 
            if (a == c) {
                System.out.println("Equilateral");
            } else {
                System.out.println("iso");
            }
        } else if (a == c) { 
            System.out.println("iso");
        } else if (b == c) {
            System.out.println("iso");
        } else {
            System.out.println("Scalene");
        }

    }
}
