import java.util.*;

public class Encrypt_this {
    public static String encryptThis(String text) {
        if (text.isEmpty()) return "";
        String[] textArray = text.split(" ");
        int lengthArray = textArray.length;
        String[][] newTextArray = new String[lengthArray][];
        for (int i = 0; i < newTextArray.length; i++) {
            newTextArray[i] = textArray[i].trim().split("");

            if (newTextArray[i].length == 1) ;
            {
                char s = newTextArray[i][0].charAt(0);
                newTextArray[i][0] = Integer.toString((int) s);
            }
            if (newTextArray[i].length >= 2) {

                String temp = newTextArray[i][1];
                newTextArray[i][1] = newTextArray[i][newTextArray[i].length - 1];
                newTextArray[i][newTextArray[i].length - 1] = temp;
            }
        }
        String www = Arrays.deepToString(newTextArray).replaceAll("\\W", "-")
                .replaceAll("---", "").replaceAll("--", "")
                .replaceAll("-", " ");
        return (www);
    }
}