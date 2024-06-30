public class Longest_Common_Subsequence {
    public static String lcs(String x, String y) {
        int lenX = x.length();
        int lenY = y.length();
        StringBuilder result = new StringBuilder();


        int[][] zChar = new int[lenX + 1][lenY + 1];
        int c = Math.max(lenX, lenY);
        for (int i = 0; i <= lenX; i++) {
            for (int j = 0; j <= lenY; j++) {
                if (i == 0 || j == 0){
                    zChar[i][j] = 0;
                }
                else if (x.charAt(i-1) == y.charAt(j-1)){
                    zChar[i][j] = (zChar[i-1][j-1] + 1);
                }
                else {
                    zChar[i][j] = Math.max(zChar[i-1][j], zChar[i][j-1]);
                }
            }
        }
        for (int i = lenX , j = lenY; i !=0 && j != 0; ) {
            if (zChar[i][j] == zChar[i-1][j]){
                i--;
            }
            else if (zChar[i][j] == zChar[i][j-1]) {
                j--;
            }
            else{
                assert x.charAt(i-1) == y.charAt(j-1);
                result.append(x.charAt(i - 1));
                i--;
                j--;
            }
        }
        return new StringBuilder(result.toString()).reverse().toString();
    }
}