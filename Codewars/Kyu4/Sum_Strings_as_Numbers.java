public class Sum_Strings_as_Numbers {
    public static String sumStrings(String a, String b) {

        StringBuilder result = new StringBuilder();
        StringBuilder num = new StringBuilder();
        int lenA = a.length();
        int lenB = b.length();

        if (Math.abs(lenA - lenB) != 0){
            for (int i = 0; i < Math.abs(lenA - lenB); i++) {
                num.append(0);}
            if (lenA > lenB)
            { b = num + b;}
            else {
                a = num + a;
                lenA = lenB; }
        }
        int k = 0;
        for (int i = 0; i < lenA; i++) {
            int res = 0;
            res = (Character.getNumericValue(a.charAt(lenA - 1 - i)) + Character.getNumericValue(b.charAt(lenA - 1 - i))) + k;
            if (res > 9) {
                res -= 10;
                k = 1;
            } else k = 0;
            result.insert(0, String.valueOf(res));
        }
        if (k == 1) result.insert(0, 1);
        while (!result.isEmpty() && result.charAt(0) == '0') {
            result.deleteCharAt(0);
        }
        return String.valueOf(result);
    }
}