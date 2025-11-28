public class MaximumOfThreeNumber {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = 15;

        if (a > b) {

            if (a > c) {
                System.out.println("A is Greater");
            } else {
                System.out.println("C is greater ");
            }

        } else if (b > c) {
            System.out.println("B is greater");
        } else {
            System.out.println("C is greater ");
        }
    }
}
