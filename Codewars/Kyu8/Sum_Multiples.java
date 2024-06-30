public class Sum_Multiples {
    public static long sumMul(int n, int m){
        if ((n <= 0) || (m <= 0)) {
            throw new IllegalArgumentException("arguments of sumMul() are меньше ZERO"); }
        int sum = 0;
        for (int i = n ; i < m ; i = i + n)
            sum += i;
        return sum;
    }
}