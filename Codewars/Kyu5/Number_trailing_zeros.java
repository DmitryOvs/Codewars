public class Number_trailing_zeros  {
    public static int zeros(int n) {

        int p = 0;
        long log = (long) (Math.log(n) / Math.log(5));
        for (int j = 1; j <= log; j++) {
            int i = (int) (n / Math.pow(5, j));
            p = p + i;
        }
        return p;
    }
}