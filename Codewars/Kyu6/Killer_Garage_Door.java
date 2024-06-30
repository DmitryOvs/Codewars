import java.util.*;
public class Killer_Garage_Door {
    public static String run(String events) {
        System.out.println(events);
        int maxValue = 5;
        int minValue = 0;
        int count = 0;
        int value = 0;
        int[] array = new int[events.length()];
        boolean neVery = true;

        for (int i = 0; i < events.length(); i++) {

            char ch = events.charAt(i);
            if (ch == 'P') {
                if (value == minValue) {
                    count = 1;
                    neVery = true;
                } else if (value == maxValue) {
                    count = -1;
                    neVery = false;
                } else if (count != 0) {
                    count = 0;
                } else {
                    count = neVery ? 1 : -1;
                }
            }
            if (ch == 'O'){
                neVery = !neVery;
                count *= -1;
            }
            value += count;
            value = value > maxValue ? maxValue : value < minValue ? minValue : value;
            array[i] = value;
        }
        return Arrays.toString(array).replaceAll("\\[|]", "").replaceAll(", ", "");

    }
}