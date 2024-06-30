public class Common_Denominators {
    // your code
    public static String convertFrac(long[][] lst) {

        StringBuilder sb = new StringBuilder();
        String p = "";

        if (lst.length == 0) return p;

        if (lst.length == 1){
            return String.format("(%d,%d)", lst[0][0], lst[0][1]);}

        long[] q = new long[lst.length];

        for (int l = 0; l < lst.length; l++) {
            q[l] = gcd(lst[l][0], lst[l][1]);
            lst[l][0] = lst[l][0]/q[l];
            lst[l][1] = lst[l][1]/q[l];
        }
        long u = lcm(lst[0][1], lst[1][1]);
        for (int l = 1; l < lst.length; l++) {
            u = lcm(lst[l][1], u);
        }

        for (int j = 0; j < lst.length; j++) {
            long h = (long) (u * lst[j][0] / lst[j][1]);
            p = String.valueOf(h);
            sb.append("(").append(p).append(",").append(u).append(")");
        }
        return (sb.toString());
    }
    public static long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }
    public static long lcm(long a, long b) {
        return a / gcd(a, b) * b;
    }
}