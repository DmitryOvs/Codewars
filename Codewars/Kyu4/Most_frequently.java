import java.util.*;
import java.util.stream.Collectors;

public class Most_frequently {

    public static List<String> top3(String s) {

        Map<String, Integer> mapPair = new HashMap<>();
        String ss = s.toLowerCase(Locale.ROOT).replaceAll("[.=;,!_:/?-]", " ")
                .replaceAll("[^a-z' ]", "").replaceAll("\\W(')\\W(')", " ").replaceAll("( )+", " ").trim();
        StringBuilder sb = new StringBuilder(ss).append(" ");

        while (!sb.isEmpty()) {
            int indexSpace = sb.indexOf(" ");
            String str = sb.substring(0, indexSpace);
            int countStr = mapPair.containsKey(str) ? mapPair.get(str) + 1 : 1;
            mapPair.put(str, countStr);
            sb.delete(0, indexSpace + 1);
        }
        Map<String, Integer> sortedMap = mapPair.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (c1, c2) -> c2,
                        LinkedHashMap::new
                ));
        List<String> keys = convertToList(sortedMap);
        for (int i = 0; i < keys.size(); i++) {
            if  ((keys.get(keys.size()-i-1).equals("") || keys.get(keys.size()-i-1).equals("'")))
                keys.remove(i);
        }
        List<String> fine = new ArrayList<>();

        int k = keys.size() >= 3 ? 3 : keys.size() == 2 ? 2 : keys.size() == 1 ? 1 : 0;
        for (int i = 0; i < k; i++) {
            fine.add(keys.get(keys.size()-i-1)); }
        return fine;
    }

    public static<K, V> List<K> convertToList(Map<K, V> map)
    {
        List<K> key = new ArrayList<>();
        map.entrySet().stream().forEach(entry -> {
            key.add(entry.getKey());
        });
        return key;}
}