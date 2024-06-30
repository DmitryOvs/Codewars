public class RgbToHex {

    public static String rgb(int r, int g, int b) {

        int[] dec = new int[]{r, g, b};
        String[] nowy = new String[3];
        String digits = "0123456789ABCDEF";

        for (int i = 0; i < 3; i++) {
            if (dec[i] <= 0) {nowy[i] = "00";}
            if (dec[i] >= 255) {nowy[i] = "FF";}
            if (dec[i] > 0 && dec[i] < 255) {
                int d = dec[i]; String c = ""; String hex = "";
                while (d > 0) {
                    int digit = d % 16;
                    hex = digits.charAt(digit) + c;
                    c = hex;
                    d = d / 16;
                }
                if (hex.length() % 2 == 1) {
                    hex = "0" + hex;
                }
                nowy[i] = hex;
            }
        }
        return String.join("", nowy);
    }
}