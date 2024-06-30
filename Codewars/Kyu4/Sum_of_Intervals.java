

public class Sum_of_Intervals {

    public static int sumIntervals(int[][] intervals) {

        for (int i = 0; i < intervals.length-1; i++) {
            for (int j = i+1; j < intervals.length; j++) {
                if (intervals[i][0] <= intervals[j][0] && intervals[i][1] >= intervals[j][1]) {
                    intervals[j][0] = intervals[i][0];
                    intervals[j][1] = intervals[i][1];
                    intervals[i][0] = 0;
                    intervals[i][1] = 0;
                }
                if (intervals[i][0] <= intervals[j][0] && intervals[i][1] >= intervals[j][0] && intervals[i][1] <= intervals[j][1]) {
                    intervals[j][0] = intervals[i][0];
                    intervals[j][1] = intervals[j][1];
                    intervals[i][0] = 0;
                    intervals[i][1] = 0;
                }
                if (intervals[i][0] > intervals[j][0] && intervals[j][1] >= intervals[i][0] && intervals[i][1] >= intervals[j][1]) {
                    intervals[j][0] = intervals[j][0];
                    intervals[j][1] = intervals[i][1];
                    intervals[i][0] = 0;
                    intervals[i][1] = 0;
                }
                if (intervals[i][0] >= intervals[j][0] && intervals[i][1] <= intervals[j][1]) {
                    intervals[i][0] = intervals[j][0];
                    intervals[i][1] = intervals[j][1];
                    intervals[i][0] = 0;
                    intervals[i][1] = 0;
                }
            }
        }
        int summa = 0;
        for (int i = 0; i < intervals.length; i++) {
            summa += intervals[i][1] - intervals[i][0];
        }
        return summa;
    }
}