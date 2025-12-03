public class Youngest {
    public static void main(String[] args) {
        // If the ages of Ram, Shyam and Ajay are input through the keyboard, write a
        // program to determine the youngest of the three
        int r = 10;
        int s = 20;
        int a = 15;

        if (r < s && r < a) {
            System.out.println("Ram is youngest");
        } else if (s < r && s < a) {
            System.out.println("Shyam is youngest");
        } else {
            System.out.println("Ajay is youngest");
        }
    }
}
