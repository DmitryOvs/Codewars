import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOfDivided {
    public static String sumOfDivided(int[] lst) {

        int minValue = Arrays.stream(lst).min().getAsInt();
        int maxValue = Arrays.stream(lst).max().getAsInt();
        maxValue = Math.max(maxValue, Math.abs(minValue));

        List<Integer> list = new ArrayList<>();
        for (int i = 2; i <= maxValue; i++) {
            if (isNumber(i))
                list.add(i);
        }
        return (resultNew(lst, list));
    }

    public static String resultNew(int[] g, List<Integer> h) {
        int a, b;
        StringBuilder sb = new StringBuilder();
        for (Integer value : h) {
            b = 0;
            a = 0;
            for (int intArr : g) {
                if (intArr % value == 0) {
                    a = value;
                    b += intArr;
                }
            }
            if (a != 0)
                sb.append("(" + a + " " + b + ")");
        }
        return sb.toString();
    }

    public static boolean isNumber(int number) {
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}