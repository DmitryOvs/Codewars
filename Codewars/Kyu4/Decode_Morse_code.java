import java.util.*;

public class MDecode_Morse_code {
    public static String decodeBits(String bits) {

        String bits1 = bits.replaceAll("^0+", "")
                .replaceAll("0$", "");
        int start = 0;
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 1; i <= bits1.length(); i++){
            if (i == bits1.length() || bits1.charAt(i-1) != bits1.charAt(i) ){
                list.add(bits1.substring(start, i));
                start = i;
            }
        }
        list.sort(Comparator.comparing(String::length));
        String temp = list.get(0);
        int count = temp.length();
        StringBuilder dd = new StringBuilder();
        if (count >1){
            for (int i = 0; i < bits1.length(); i+=count) {
                dd.append(bits1.charAt(i));
            }
            bits1 = dd.toString();
        }
        String morseCode = bits1.replaceAll("0{7}", "   ").
                replaceAll("0{3}", " ").
                replace("111", "-").
                replaceAll("0{1,2}", "").
                replace("1", ".");

        return morseCode;
    }

    public static String decodeMorse(String morseCode) {

        String result = "";
        for(String word : morseCode.trim().split("   ")) {
            for(String letter : word.split("\\s+")) {
                result += MorseCode.get(letter);
            }
            result += ' ';
        }
        return result.trim();
    }
}