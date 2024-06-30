import java.util.*;

public class Battle_ships_Sunk {

    public static Map<String,Double> damagedOrSunk(final int[][] board, final int[][] attacks) {
        int k = 0, n = 0, m = 0, p = 0, s = 0, r = 0;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 1) k++;
                if (board[i][j] == 2) n++;
                if (board[i][j] == 3) m++;
            }
        }
        int u = m > 0 ? 3 : n > 0 ? 2 : 1;
        int point = 0;

        for (int i = 0; i < attacks.length; i++) {
            int x = attacks[i][0];
            int y = attacks[i][1];
            System.out.println(x + " " + y);
            point = board[board.length-y][x-1];
            if (point == 1) p++;
            if (point == 2) r++;
            if (point == 3) s++;
            point = 0;
        }
        double l = p == k && p != 0 ? 1 : p < k && p != 0 ? 0.6 : 0;
        double b = r == n && r != 0 ? 1 : r < n && r != 0 ? 0.6 : 0;
        double h = s == m && s != 0 ? 1 : s < m && s != 0 ? 0.6 : 0;

        double g = u == 3 ? l+b+h : u == 2 ? l+b : l;
        double e = g == 3 ? 3 : g == 2.6 ? 2 : g == 2.2 ? 1 : g == 1.6 ? 1 : g == 1 ? 1 : g==2.0 ? 2 : 0;
        double d = g == 2.2 ? 2 : g == 1.6 ? 1 : g == 1.2 ? 2 : g == 0.6 ? 1 : 0;
        double o = u - e - d;
        g = e + d*0.5 - o;

        Map<String, Double> ship = new HashMap<>();
        ship.put("sunk", e);
        ship.put("damaged", d);
        ship.put("notTouched", o);
        ship.put("points", g);

        return ship;
    }
}