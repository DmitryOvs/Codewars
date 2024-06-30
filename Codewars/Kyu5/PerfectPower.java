public class PerfectPower {
    public static int[] isPerfectPower(int n) {
        double current = Math.sqrt(n);
        for (int i = 2, j = 2; i <= current; ) {
            final int currentPow = (int) Math.pow(i, j);
            if (currentPow == n) {
                return new int[]{i, j};
            } else if (currentPow > n) {
                i++;
                j = 2;
            } else {
                j++;
            }
        }
        return null;
    }
}