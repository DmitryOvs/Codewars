public class Integers_Recreation_One {

    public static String listSquared(long m, long n) {

        StringBuilder result = new StringBuilder("[");

        for (long i = m; i < n; i++) {
            long summa = 0;
            for (long j = 1; j <= i; j++) {
                if (i % j == 0) {
                    summa += (j*j);
                }
            }
            long h = (long) Math.sqrt(summa);
            if (summa%h == 0 && summa/h == h){
                result.append("[").append(i).append(", ").append(summa).append("]");
            }
        }
        result.append("]");
        return (result.toString().replaceAll("]\\[", "], ["));
    }
}