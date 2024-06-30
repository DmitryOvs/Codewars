import java.util.*;

public class Directions_Reduction {
    public static String[] dirReduc(String[] arr) {
        int length = arr.length - 1;
        List<String> listResult = new ArrayList<>(Arrays.asList(arr));

        for (int i = 0; i < length; i++) {

            if (listResult.get(i) == "NORTH" && listResult.get(i + 1) == "SOUTH") {
                listResult.remove(i + 1);
                listResult.remove(i);
                i = -1; length -=2;
            }
            else if (listResult.get(i) == "SOUTH" && listResult.get(i + 1) == "NORTH") {
                listResult.remove(i + 1);
                listResult.remove(i);
                i = -1; length -=2;
            }
            else if (listResult.get(i) == "WEST" && listResult.get(i + 1) == "EAST") {
                listResult.remove(i + 1);
                listResult.remove(i);
                i = -1; length -=2;
            }
            else if (listResult.get(i) == "EAST" && listResult.get(i + 1) == "WEST") {
                listResult.remove(i + 1);
                listResult.remove(i);
                i = -1; length -=2;
            }
        }
        String[] oxxo = new String[listResult.size()];
        for (int i = 0; i < listResult.size(); i++) {
            oxxo[i] = listResult.get(i);}
        return (oxxo);
    }
}