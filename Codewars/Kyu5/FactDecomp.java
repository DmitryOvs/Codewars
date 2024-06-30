import java.util.*;

class FactDecomp {

    static int count = 0;

    public static String decomp(int n) {

        List<Integer> prime = new ArrayList<>();
        Map<Integer, Integer>  mapSort= new TreeMap<>();
        String result = " ";
        for (int i = 1; i <= n; i++) {
            if (isPrime(i)){
                prime.add(i);
            }
        }

        for (int i = 0; i < prime.size(); i++) {
            int vv = 0;
            pow(prime.get(i), n);
            for (int j = 1; j <= count; j++) {
                vv += n / (int) Math.pow(prime.get(i), j);
            }
            mapSort.put(prime.get(i), vv);
        }
        for(Map.Entry<Integer, Integer> map : mapSort.entrySet()){
            result += String.format("%d^%d * ", map.getKey(), map.getValue());
        }
        result = result.replaceAll("\\^1\\b", "");
        result = result.replaceAll("( \\* $)", "");
        result = result.replaceAll("^ ", "");
        return (result);
    }


    private static boolean isPrime(int n) {
        if (n < 2) return false;
        if (n % 2 == 0) return n == 2;
        if (n % 3 == 0) return n == 3;
        for (int j = 5; j * j <= n; j += 6) {
            if (n % j == 0 || n % (j + 2) == 0) {
                return false;
            }
        }
        return true;
    }
    private static int pow (int value , int number){
        count = 0; int p = 1;
        while (p <= number){
            p = value * p;
            count++;
        }
        return count-1;
    }
}