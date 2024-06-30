public class Primes_numbers {

    public static String factors(int n) {
        String stringRes = "";
        int count = 0;
        int i = 2;

        while (n > 1) {
            while (n % i == 0) {
                n /= i;
                count++;
            }
            if (count == 1)
                stringRes += "(" + i + ")";
            else if (count > 1)
                stringRes += "(" + i + "**" + count + ")";
            i++;
            count = 0;
        }
        return (stringRes);
    }
}