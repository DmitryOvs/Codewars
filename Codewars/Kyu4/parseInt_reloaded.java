import java.util.ArrayList;
import java.util.List;

public class parseInt_reloaded {

    public static int parseInt(String numStr) {

        String[] digitalStr = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven",
                "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty",
                "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety", "hundred", "thousand", "million"};

        int[] digitalInt = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 30, 40, 50, 60, 70,
                80, 90, 100, 1_000, 1_000_000};

        String[] number = numStr.split("[ -]");
        List<Integer> res = new ArrayList<>();

        int resultDigital = 0; int k = 1;

        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < digitalStr.length; j++) {
                if (digitalStr[j].equals(number[i])) {

                    if ("hundred".equals(number[i])) {
                        if (resultDigital == 0) k = 100;
                        resultDigital *= 100;
                        res.add(resultDigital);
                        resultDigital = 0;
                        break;
                    } else if ("thousand".equals(number[i])) {
                        if (resultDigital == 0) {k = 1000; res.add(k); break;}
                        resultDigital *= 1_000;
                        res.add(resultDigital);
                        resultDigital = 0;
                        break;
                    } else if ("million".equals(number[i])) {
                        if (resultDigital == 0) k = 1_000_000;
                        resultDigital *= 1_000_000;
                        res.add(resultDigital);
                        resultDigital = 0;
                        break;
                    }
                    resultDigital += digitalInt[j];
                    if (i == number.length-1) {
                        res.add(resultDigital);
                    }
                    break;
                }
            }
        }
        int summa = 0;
        for (int i = 0; i < res.size()-1; i++) {
            if(res.get(i) < res.get(i+1) && k == res.get(i+1)) res.set(i, (res.get(i)*1000)-1000);
            if(res.get(i) < res.get(i+1)) res.set(i, res.get(i)*1000);}

        for (int i = 0; i < res.size(); i++) {
            summa += res.get(i);
        }
        return summa;
    }
}