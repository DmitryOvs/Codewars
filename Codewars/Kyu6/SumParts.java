import java.util.*;

class SumParts {

    public static int[] sumParts(int[] ls) {

        int[] lsD = new int[ls.length+1];
        lsD[0] = Arrays.stream(ls).sum();
        int n = lsD[0];
        for (int i = 0; i < ls.length; i++) {
            n -= ls[i];
            lsD[i+1] = n;
        }
        return lsD;
    }
}