package Loop;

public class Fibbanacci {
    public static void main(String[] args) {
        int n = 7;

        int ft = 0;
        int st = 1;

        for (int i = 1; i <= n; i++) {
            System.out.println(ft);
            int tt = ft + st;
            ft = st;
            st = tt;
        }
    }
}
