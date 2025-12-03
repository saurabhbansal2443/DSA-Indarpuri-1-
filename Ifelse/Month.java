public class Month {
    public static void main(String[] args) {
        // Write a Java program to find days in a month (Take input of Year and month
        // number).

        int m = 8;
        int year = 2004;

        if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
            System.out.println("31 Days");
        } else if (m == 4 || m == 6 || m == 9 || m == 11) {
            System.out.println("30 Days");
        } else if (m == 2) {
            if (year % 4 == 0) {
                System.out.println("29 Days");
            } else {
                System.out.println("28 Days");
            }
        } else {
            System.out.println("Invalid Month or Year ");
        }
    }
}
