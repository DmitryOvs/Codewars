import java.util.Arrays;

public class Consonant_value {
    public static int solve(final String s) {

        String[] ss = s.split( "[aeiou]");
        int[] a = new int[ss.length];

        for (int i = 0; i < ss.length; i++) {
            for (int j = 0; j < ss[i].length(); j++) {
                a[i] += ss[i].charAt(j) - 96;
            }
        }
        Arrays.sort(a);

        return a[a.length-1];
    }
}