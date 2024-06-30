import java.util.List;
import java.util.ArrayList;

public class CaesarCipher {

    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    private static final String ALPHABETBIG = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static List<String>  movingShift(String s, int shift) {
        String ss = "";
        String tt = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j <= ALPHABET.length()*2; j++) {
                int r = (j + shift + i) % 26;
                if (j < 26){
                    if (s.charAt(i) == ALPHABET.charAt(j)){
                        tt = String.format("%s", ALPHABET.charAt(r));
                        break;
                    }
                }
                if (j >= 26 && j < ALPHABET.length()*2) {
                    if (s.charAt(i) == ALPHABETBIG.charAt(j%26)) {
                        tt = String.format("%s", ALPHABETBIG.charAt(r));
                        break;
                    }
                }
                else tt = String.valueOf(s.charAt(i));
            }
            ss = ss + tt;
        }
        int k = (int) Math.ceil((double) s.length() /5);
        List<String> v = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            v.add(ss.substring(k*i, k*(i+1)));}
        v.add(ss.substring(k*4));

        return v;
    }

    public static String  demovingShift(List<String> v, int shift) {

        String sss = String.join("", v);
        String ssss = "";
        String tt = "";
        for (int i = 0; i < sss.length(); i++) {
            for (int j = 0; j <= ALPHABET.length()*2; j++) {
                int r = (j - shift - i)%26;
                if (r<0){
                    r = 26 + r;}
                if (j < 26){
                    if (sss.charAt(i) == ALPHABET.charAt(j)){
                        tt = String.format("%s", ALPHABET.charAt(r));
                        break;
                    }
                }
                if (j >= 26 && j < ALPHABET.length()*2) {
                    if (sss.charAt(i) == ALPHABETBIG.charAt(j%26)) {
                        tt = String.format("%s", ALPHABETBIG.charAt(r));
                        break;
                    }
                }
                else tt = String.valueOf(sss.charAt(i));
            }
            ssss = ssss + tt;
        }
        return ssss;
    }
}