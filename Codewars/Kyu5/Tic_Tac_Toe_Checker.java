public class Tic_Tac_Toe_Checker {

    public static int isSolved(int[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == 2){
                    board[i][j] =20;
                }
            }
        }
        int diagLeft = 0;
        int diagRight = 0;
        for (int i = 0; i < 3; i++) {
            diagLeft += board[i][i];
            diagRight += board [i][2-i];
        }
        if (diagRight == 3 || diagLeft == 3){
            return 1;
        }
        if (diagRight == 60 || diagLeft == 60){
            return 2;
        }
        int cowI , colJ;
        boolean hasEmpty = false;
        for (int i = 0; i < 3; i++) {
            cowI = 0;
            colJ = 0;
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == 0){
                    hasEmpty = true;
                }
                cowI += board[i][j];
                colJ += board[j][i];
            }
            if (cowI == 3 || colJ == 3){
                return 1;
            }
            if (cowI == 60 || colJ == 60){
                return 2;
            }
        }
        return hasEmpty ? -1 : 0;
    }

}