import java.util.*;

public class Strings_Mix {

    final static char[] alfavitic = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

    public static String mix(String s1, String s2) {

        ArrayList<String> list = new ArrayList<>();
        StringBuilder res = new StringBuilder();

        String newS1 = s1.replaceAll("[^a-z]", "");
        String newS2 = s2.replaceAll("[^a-z]", "");

        char[] charS1 = newS1.toCharArray();
        char[] charS2 = newS2.toCharArray();

        Arrays.sort(charS1);
        Arrays.sort(charS2);

        String str1 = String.valueOf(charS1);
        String str2 = String.valueOf(charS2);

        for (int i = 0, i1 = 0, i2 = 0; i < 26; i++) {
            char c = alfavitic[i];
            int num1 = 0, num2 = 0, num = 0;
            String g = "";
            for (int j = 0; j < str1.length(); j++) {
                if (c == charS1[j]) {
                    num1 = str1.lastIndexOf(charS1[j]) - str1.indexOf(charS1[j]) + 1;
                    j = num1 - 1;
                    break;
                }
            }
            for (int k = 0; k < str2.length(); k++) {
                if (c == charS2[k]) {
                    num2 = str2.lastIndexOf(charS2[k]) - str2.indexOf(charS2[k]) + 1;
                    k = num2 - 1;
                    break;
                }
            }
            if (num1 > 1 && num1 > num2) {
                num = num1;
                g = "1";
            }
            if (num2 > 1 && num1 < num2) {
                num = num2;
                g = "2";
            }
            if (num1 == num2 && num2 > 1) {
                num = num2;
                g = "=";
            }
            if (num > 1)
                list.add(String.format("%s:%s/", g, String.valueOf(c).repeat(num)));

        }
        if(list.size() == 0) return "";

        Comparator<String> stringLengthComparator = new StringLengthSort();

        Collections.sort(list, stringLengthComparator);

        for (String s:list) {
            res.append(s);
        }
        return  (res.substring(0, res.length()-1)).toString();

    }
    static class StringLengthSort implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            if (o2.length() > o1.length()) {
                return 1;
            } else if (o2.length() < o1.length()) {
                return -1;
            } else {
                if (o1.charAt(0) > o2.charAt(0)) {
                    return 1;
                }
                if (o1.charAt(0) < o2.charAt(0)) {
                    return -1;
                } else {
                    return 0;
                }
            }
        }
    }
}