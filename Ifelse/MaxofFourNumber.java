public class MaxofFourNumber {
    public static void main(String[] args) {

        int a = 10;
        int b = 15;
        int c = 20;
        int d = 7;

        if (a > b) {
            if (a > c) {
                if (a > d) {
                    System.out.println(a);
                } else {
                    System.out.println(d);
                }
            } else if (c > d) {
                System.out.println(c);
            } else {
                System.out.println(d);
            }
        } else if (b > c) {
            if (b > d) {
                System.out.println(b);
            } else {
                System.out.println(d);
            }
        } else if (c > d) {
            System.out.println(c);
        } else {
            System.out.println(d);
        }
    }
}
