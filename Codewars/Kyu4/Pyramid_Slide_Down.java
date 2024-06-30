public class Pyramid_Slide_Down {

    public static int longestSlideDown(int[][] pyramid) {

        int[][] result = pyramid;

        for (int i = pyramid.length-2; i >= 0; i--) {
            for (int j = 0; j < pyramid[i].length; j++) {
                result[i][j] = pyramid[i][j] + Math.max(pyramid[i + 1][j], pyramid[i + 1][j + 1]);
            }
        }
        return result[0][0];
    }
}