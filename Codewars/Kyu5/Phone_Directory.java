import java.util.ArrayList;
import java.util.List;

class Phone_Directory {

    public static  String phone(String strng, String num1) {
        String num = String.format("+%s", num1);
        System.out.println(strng);
        String[] stroki = strng.split("\n");
        List<String> result = new ArrayList<>();
        for (String aaa : stroki) {
            if (aaa.contains(num))
                result.add(aaa);
        }
        int numSize = result.size();
        System.out.println(result);
        System.out.println(numSize);
        if (numSize == 0) return String.format("Error => Not found: %s", num1);
        if (numSize > 1) return String.format("Error => Too many people: %s", num1);

        String name = result.get(0).replaceAll("(.*)<(.*)>(.*)", "$2");
        String address = result.get(0)
                .replaceAll("[;+!,/$:*?]", "")
                .replaceAll(num1, "")
                .replaceAll("<(.*)>(.*)", "$2")
                .replaceAll("_|\\s+", " ")
                .trim();

        return   String.format("Phone => %s, Name => %s, Address => %s", num1, name, address);

    }
}