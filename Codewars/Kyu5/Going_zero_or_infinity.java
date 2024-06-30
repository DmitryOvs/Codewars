import java.math.BigDecimal;
public class Going_zero_or_infinity {

    public static double going(int n) {

        BigDecimal bbb = BigDecimal.ZERO;
        BigDecimal result = BigDecimal.ONE;

        for (int i = 1; i <= n; i++){
            result = result.multiply(BigDecimal.valueOf(i));
            bbb = bbb.add(result);
        }
        int scala = 6;
        int round = 1;

        BigDecimal gg = (bbb).divide(result, scala, round);

        return gg.doubleValue();
    }
}