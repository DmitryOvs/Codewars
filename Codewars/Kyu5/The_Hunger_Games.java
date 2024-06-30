import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class The_Hunger_Games {

    public static String[] whoEatsWho(final String zoo) {

        List<String> zooNew = Stream.of(zoo.split(",", -1))
                .collect(Collectors.toList());

        String[] zooArr = {"antelope eats grass", "big-fish eats little-fish", "bug eats leaves", "bear eats big-fish",
                "bear eats bug", "bear eats chicken", "bear eats cow", "bear eats leaves", "bear eats sheep", "chicken eats bug",
                "cow eats grass", "fox eats chicken", "fox eats sheep", "fox eats sheep", "giraffe eats leaves", "lion eats antelope",
                "lion eats cow", "panda eats leaves", "sheep eats grass"};
        List<String> animal = new ArrayList<>();
        animal.add(zoo);

        for (int i = 0; i < zooNew.size(); i++) {

            if (i > 0) {
                for (int k = 0; k < zooArr.length; k++) {
                    if ((String.format("%s eats %s", zooNew.get(i), zooNew.get(i - 1))).contains(zooArr[k])) {
                        zooNew.remove(i-1);
                        animal.add(zooArr[k]);
                        i = 0; break;
                    }
                }
            }
            if (i < zooNew.size() - 1 ) {
                for (int j = 0; j < zooArr.length; j++) {
                    if ((String.format("%s eats %s", zooNew.get(i), zooNew.get(i + 1))).contains(zooArr[j])) {
                        zooNew.remove(i + 1);
                        animal.add(zooArr[j]);
                        i = -1; break;
                    }
                }
            }
        }
        String vov = zooNew.toString();
        vov = vov.replace(" ", "");
        vov = vov.replace("[", "");
        vov = vov.replace("]", "");
        animal.add(vov);

        return animal.toArray(String[]::new);
    }
}
