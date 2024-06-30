class Solution {

    public static String Rot13(String message) {
        StringBuilder sb = new StringBuilder();
        for (char s : message.toCharArray()) {
            if (s >= 'A' && s <= 'M') s += 13;
            else if (s >= 'N' && s <= 'Z') s -= 13;
            else if (s >= 'a' && s <= 'm') s += 13;
            else if (s >= 'n' && s <= 'z') s -= 13;
            sb.append(s);
        }
        return sb.toString();
    }
}