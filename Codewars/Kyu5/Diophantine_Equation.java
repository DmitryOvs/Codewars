public class Diophantine_Equation {

    public static String Diophantine_Equation(long n) {
        System.out.println(n);
        long j = 1, x = 0, y = 0;
        StringBuilder f = new StringBuilder();
        for (long i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                j = n / i;
                if ((j + i) % 2 == 0) {
                    x = (j + i) / 2;
                    if ((j - i) % 4 == 0) {
                        y = (j - i) / 4;
                        if (x != 0 || y != 0){
                            f.append(String.format("[%d, %d], ", x, y));
                        }
                    }
                }
            }
        }
        if (!f.isEmpty()){
            f = new StringBuilder("[" + f.substring(0, f.length() - 2) + "]");}
        else f = new StringBuilder("[]");

        return (f.toString());
    }
}
