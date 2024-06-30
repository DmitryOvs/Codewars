public class Credit_Card_Mask {
    public static String maskify(String str) {
        String zzz = str.replaceAll(".(?!.{0,3}$)", "#");

        return zzz;
    }
}