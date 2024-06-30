import java.util.*;

public class Get_mean_array{

    public static int getAverage(int[] marks){

        int marksred = Arrays.stream(marks).sum();

        return marksred/marks.length;

    }
}
