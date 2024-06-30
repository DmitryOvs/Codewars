import java.util.*;

public class Greed{
    public static int greedy(int[] dice){


        int summa = 0;   int count = 0;
        String str = "123456";
        String d = Arrays.toString(dice).replaceAll("\\[|]|,| ", "");
        for (String s : str.split("")) {
            count = d.length() - d.replaceAll(s, "").length();
            if (count >= 3) {
                if (s.equals("2")) {
                    summa += 200;
                }
                if (s.equals("3")) {
                    summa += 300;
                }
                if (s.equals("4")) {
                    summa += 400;
                }
                if (s.equals("6")) {
                    summa += 600;
                }
            }
            if (s.equals("1")) {
                if (count >= 3) {
                    summa += 1000 + (count-3) * 100;
                }
                if (count < 3) {
                    summa += count * 100;
                }
            }
            if (s.equals("5")) {
                if (count >= 3) {
                    summa += 500 + (count-3) * 50;
                }
                if (count < 3) {
                    summa += count * 50;
                }
            }
        }
        return summa;
    }
}