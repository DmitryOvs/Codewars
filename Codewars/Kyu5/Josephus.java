import java.util.ArrayList;
import java.util.List;

public class Josephus {
    public static <T> List<T> josephusPermutation(final List<T> items, final int k) {

        List<T> res = new ArrayList<>();
        int i = k-1;
        while (items.size() <= i && items.size()>0){
            i =  i-items.size();
        }
        while (items.size()>0){
            res.add(items.get(i));
            items.remove(i);
            i = i+k-1;
            while (items.size() <= i && items.size()>0){
                i =  i-items.size();
            }
        }
        return (res);
    }
}