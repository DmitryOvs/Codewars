public class TheClockwiseSpiral {

    public static int[][] createSpiral(int n) {
        int x = 1 , y = 1, a = 0, b = -1;
        int[][] array = new int[n][n];
        while (n > 0) {
            for (int i = 0; i < n; i++) {
                b += y;
                array[a][b] = x;
                x++;
            }
            n--;
            for (int i = 0; i < n; i++) {
                a += y;
                array[a][b] = x;
                x++;}
            y *=-1;
        }
        return array;
    }
}