
public class Battleship_field_validator {

    public static boolean fieldValidator(int[][] battleField) {

        int summa = 0;
        for (int i = 0; i < battleField.length; i++) {
            for (int j = 0; j < battleField[i].length; j++) {
                summa += battleField[i][j];
            }
        }
        if (summa != 20) return false;

        int[][] field = new int[12][12];
        for (int i = 0; i < battleField.length; i++) {
            for (int j = 0; j < battleField[i].length; j++) {
                field[i+1][j+1] = battleField[i][j];
            }
        }
        int x, y, pp, count, count1 = 0, count2 = 0, count3 = 0, count4 = 0;
        for (int i = 1; i < 12; i++) {
            for (int j = 1; j < 12; j++) {
                y = i; x = j; pp = 0; count=0;
                while (field[i][j] == 1) {
                    count++; j++; }
                for (int k = 0; k < count; k++) {
                    if (field[y][x-1] == 0 && field[y-1][x-1] == 0 && field[y+1][x-1] == 0 && field[y][x+count] == 0 &&
                            field[y-1][x+count] == 0 && field[y+1][x+count] == 0 && field[y-1][x+k] == 0 && field[y+1][x+k] == 0){
                        pp++;
                        if (count == pp) {
                            switch (count) {
                                case 1 -> count1++;
                                case 2 -> count2++;
                                case 3 -> count3++;
                                case 4 -> count4++;
                            }
                        }
                    }
                }
            }
        }
        for (int i = 1; i < 12; i++) {
            for (int j = 1; j < 12; j++) {
                y = i; x = j; pp = 0; count=0;
                while (field[j][i] == 1) {
                    count++; j++; }
                for (int k = 0; k < count; k++) {
                    if (field[x-1][y-1] == 0 && field[x-1][y] == 0 && field[x+1][y+1] == 0 && field[x+count][y-1] == 0 &&
                            field[x+count][y] == 0 && field[x+count][y+1] == 0 && field[x+k][y-1] == 0 && field[x+k][y+1] == 0){
                        pp++;
                        if (count == pp) {
                            switch (count) {
                                case 1 -> count1++;
                                case 2 -> count2++;
                                case 3 -> count3++;
                                case 4 -> count4++;
                            }
                        }
                    }
                }
            }
        }
        return (count1 == 8 && count2 == 3 && count3 == 2 && count4 == 1);
    }
}