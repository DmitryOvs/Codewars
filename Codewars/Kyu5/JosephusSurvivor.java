import java.util.*;

public class JosephusSurvivor {
    public static int josephusSurvivor(final int n, final int k) {
        List<Integer> items = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            items.add(i);
        }
        int i = k-1;
        while (items.size() <= i){
            i =  i-items.size();
        }
        while (items.size()>1){
            items.remove(i);
            i = i+k-1;
            while (items.size() <= i && items.size()>1){
                i =  i-items.size();
            }
        }
        return (items.get(0));
    }
}
