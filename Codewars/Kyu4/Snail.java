public class Snail {

    public static int[] snail(int[][] array) {

        int[] r = new int[array.length * array.length];
        if (array.length == 1) return array[0];
        int count = 0;
        int rowLimit = array.length;
        int columnLimit = array.length;
        int row = 0;
        int column = 0;

        while (count < array.length * array.length){
            for (int i = column; i < columnLimit; i++) {
                r[count] = array[row][i];
                count++;
            }
            for (int i = row+1; i < rowLimit; i++) {
                r[count] = array[i][columnLimit-1];
                count++;
            }
            for (int i = columnLimit-2; i >= column; i--) {
                r[count] = array[rowLimit-1][i];
                count++;
            }
            for (int i = rowLimit-2; i > row; i--) {
                r[count] = array[i][column];
                count++;
            }
            row++;
            column++;
            rowLimit--;
            columnLimit--;
        }
        return r;
    }
}