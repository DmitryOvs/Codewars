import java.util.*;

public class PickPeaks {

    public static Map<String,List<Integer>> getPeaks(int[] arr) {

        List<Integer> pos = new ArrayList<>();
        List<Integer> peaks = new ArrayList<>();

        int indexA = 0;
        for (int indexB = 1; indexB < arr.length; indexB++) {
            if (arr[indexA] == arr[indexB])
                continue;
            if (arr[indexB] > arr[indexA])
                indexA = indexB;
            else if (indexA > 0) {
                pos.add(indexA);
                peaks.add(arr[indexA]);
                indexA = 0;
            }
            arr[indexA] = arr[indexB];
        }
        return Map.of("pos", pos, "peaks", peaks);
    }
}