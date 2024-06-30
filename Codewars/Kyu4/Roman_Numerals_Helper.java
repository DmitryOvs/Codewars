public class Roman_Numerals_Helper {

    static final int[] arab = { 1, 4, 5, 9, 10 , 40, 50, 90, 100, 400, 500, 900, 1000 };
    static final String[] roman = { "I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};

    public static String toRoman(int n) {

        StringBuilder romanNumeral = new StringBuilder();
        for (int i = arab.length-1; i >= 0 ; i--) {
            while (n>=arab[i]) {
                n -= arab[i];
                romanNumeral.append(roman[i]);
            }
        }
        return romanNumeral.toString();
    }

    public static int fromRoman(String romanNumeral) {
        int curr = 0;
        int res = 0;
        for (int i = romanNumeral.length()-1; i >=0 ; i--) {
            for (int j = 0; j < arab.length; j++) {
                if (roman[j].equals(String.valueOf(romanNumeral.charAt(i)))) {
                    if (curr > arab[j]) {
                        res -= arab[j];
                    } else {
                        res += arab[j];
                    }
                    curr = arab[j];
                    break;
                }
            }
        }
        return res;
    }
}