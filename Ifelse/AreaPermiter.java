import java.util.*;

public class AreaPermiter {
    public static void main(String[] args) {
        // You are given two integers that are the length and breadth of the rectangle.
        // Check whether the area or perimeter is greater
        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();
        int breadth = sc.nextInt();

        int area = length * breadth;
        int perimeter = 2 * (length + breadth);

        if (area > perimeter) {
            System.out.println("Area");
        } else if (area < perimeter) {
            System.out.println("Perimeter");
        } else {
            System.out.println("Both are equal");
        }

    }
}
