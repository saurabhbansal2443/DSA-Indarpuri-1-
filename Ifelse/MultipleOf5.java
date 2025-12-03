public class MultipleOf5 {
    public static void main(String[] args) {
        // Write a Java program to check whether the given integer is a multiple of 5

        int n = 35;

        int rem = n % 5;

        if (rem == 0) {
            System.out.println("Mutiple of 5 ");
        } else {
            System.out.println("Not a Multiple");
        }
    }
}
