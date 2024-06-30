public class Multiplication_table{
    public static int [][] multiplicationTable(int n){
        int[][] side = new int[n][n];
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n; j++) {
                side[i][j] = (i+1)*(j+1);
            }
        }
        return side;
    }
}