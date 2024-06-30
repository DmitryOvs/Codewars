public class Decimal_Factorial_and_Back {

    private static final String DIGITALALPHABET = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static String dec2FactString(long nb) {

        String tt = "";
        String str = "";

        for (int i = 1; i < 36; i++) {
            long ost = (int) (nb % i);
            nb /= i;
            tt = String.format("%s", DIGITALALPHABET.charAt((int) ost));
            str = tt + str; System.out.println(str);
            if (nb == 0) {
                break;
            }
        }
        return str;
    }
    public static long factString2Dec(String str) {

        long fac = DIGITALALPHABET.indexOf(str.charAt(0));

        for (int i = str.length(); i > 2; i--) {
            int l = DIGITALALPHABET.indexOf(str.charAt(str.length()-i+1));
            fac = (long) (i-1) * fac +l;
        }
        return fac;
    }
}