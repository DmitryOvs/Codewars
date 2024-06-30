public class Square_Matrix_Multiplication {

    public static int[][] matrixMultiplication(int[][] a, int[][] b) {

        int[][] c = new int[a.length][a[1].length];

        for (int k = 0; k < a.length; k++) {
            for (int l = 0; l < a.length; l++) {
                for (int m = 0; m < a.length; m++) {
                    c[l][m] += a[l][k]*b[k][m];
                }
            }
        }
        return c;
    }
}