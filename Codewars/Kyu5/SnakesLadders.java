public class SnakesLadders {

    static int prevPosPlayer1;
    static int prevPosPlayer;
    static int prevPosPlayer2;
    static String player;
    static String player1;
    static String player2;
    boolean isGameStopped;

    public SnakesLadders() {

        prevPosPlayer1 = 0;
        prevPosPlayer2 = 0;
        prevPosPlayer = 0;
        player = "";
        player1 = "1";
        player2 = "2";
        player = player1;
        isGameStopped = false;
    }

    public String play(int die1, int die2) {

        int x=0;
        int square = 0;
        int scout = die1 + die2;


        if (player == player1) {
            prevPosPlayer = prevPosPlayer1;
            x=1;}
        if (player == player2) {
            prevPosPlayer = prevPosPlayer2;
            x=2;}

        square = prevPosPlayer + scout;

        if (square > 100) {
            square = 200 - square;}

        int squareNew = square;

        switch (square) {
            case 2:
                squareNew = 38;
                break;
            case 7:
                squareNew = 14;
                break;
            case 8:
                squareNew = 31;
                break;
            case 15:
                squareNew = 26;
                break;
            case 21:
                squareNew = 42;
                break;
            case 28:
                squareNew = 84;
                break;
            case 36:
                squareNew = 44;
                break;
            case 51:
                squareNew = 67;
                break;
            case 71:
                squareNew = 91;
                break;
            case 78:
                squareNew = 98;
                break;
            case 87:
                squareNew = 94;
                break;
            case 99:
                squareNew = 80;
                break;
            case 95:
                squareNew = 75;
                break;
            case 92:
                squareNew = 88;
                break;
            case 89:
                squareNew = 68;
                break;
            case 74:
                squareNew = 53;
                break;
            case 62:
                squareNew = 19;
                break;
            case 64:
                squareNew = 60;
                break;
            case 46:
                squareNew = 25;
                break;
            case 49:
                squareNew = 11;
                break;
            case 16:
                squareNew = 6;
                break;
        }

        if (die1 == die2 && square != squareNew) {
            if (player == player1) {
                prevPosPlayer1 = squareNew;
            } else {
                prevPosPlayer2 = squareNew;
            }
        }
        if (die1 == die2 && square == squareNew) {
            if (player == player1) {
                prevPosPlayer1 = square;
            } if (player == player2) {
                prevPosPlayer2 = square;
            }
        }

        square = squareNew;

        if (die1 != die2) {
            if (player == player1) {
                prevPosPlayer1 = square; player = player2;
            } else {
                prevPosPlayer2 = square; player = player1;
            }
        }
        if (square == 100 && !isGameStopped) {
            isGameStopped = true;
            return String.format("Player %d Wins!", x);
        } else {
            if (isGameStopped) {
                return ("Game over!");
            }
            return String.format("Player %d is on square %d", x, square);
        }
    }
}
