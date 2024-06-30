
public class Merged_String_Checker {

    public static boolean isMerge(String s, String part1, String part2) {

        if (s.isEmpty()) return part1.isEmpty() && part2.isEmpty();
        if (s.length() != part1.length() + part2.length()) return false;
        if (part2.equals(part1)) return false;

        char[] result = new char[s.length()];
        char[] p1 = part1.toCharArray();
        char[] p2 = part2.toCharArray();
        char[] sStr = s.toCharArray();

        for (int i = 0, j = 0, k = 0; i < s.length() ; i++){
            if (j < part1.length() && k < part2.length() && p1[j] == p2[k]  ){
                result[i] = sStr[i];
            }
            else if (j < part1.length() && p1[j] == sStr[i]){
                result[i] = sStr[i];
                j++;
            }
            else if (k < part2.length() && p2[k] == sStr[i]){
                result[i] = sStr[i];
                k++;
            }
        }
        String rrr = new String(result);
        if (rrr.equals(s)){
            return true;
        }
        return false;
    }
}