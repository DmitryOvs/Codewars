import java.util.*;
public class CountIPAddresses {

    public static long ipsBetween(String start, String end) {
        System.out.println(start);

        String[] startS = start.split("\\.");
        String[] endS = end.split("\\.");
        int[] startI = Arrays.stream(startS).mapToInt(Integer::parseInt).toArray();
        int[] endI = Arrays.stream(endS).mapToInt(Integer::parseInt).toArray();
        long sum = (long) (endI[0] - startI[0]) *256*256*256 + (long)(endI[1] - startI[1]) *256*256 + (long)(endI[2] - startI[2]) *256 + endI[3] - startI[3];
        return(sum);
    }
}