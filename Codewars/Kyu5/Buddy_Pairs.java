public class Buddy_Pairs {
    public static String buddy(long start, long limit) {
        for (long i = start; i <= limit; i++) {
            long sum = 0;
            long res = 0;
            long middle = 1;
            for (long j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    if (i / j == j) middle += j;
                    else middle += (i / j + j);
                }
            }
            sum = middle;
            if (sum > i) {
                long k = sum - 1;
                middle = 1;
                for (long j = 2; j * j <= k; j++) {
                    if (k % j == 0) {
                        if (k / j == j) middle += j;
                        else middle += (k / j + j);
                    }
                }
                res = middle;
            }
            if (i == res - 1) return ("(" + i + " " + (sum - 1) + ")");
        }
        return ("Nothing");
    }
}
