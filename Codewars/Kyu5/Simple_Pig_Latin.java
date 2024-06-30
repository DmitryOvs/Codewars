import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Simple_Pig_Latin {
    public static String pigIt(String str) {

        String[] arr = str.split(" ");
        StringBuilder s = new StringBuilder();
        for (String string : arr) {
            Pattern simbol = Pattern.compile("\\p{P}");
            Matcher mat = simbol.matcher(string);
            if (mat.find()) {
                s.append(string);
            } else {
                s.append(string.substring(1)).append(string.charAt(0)).append("ay ");
            }
        }
        return s.toString().trim();
    }
}