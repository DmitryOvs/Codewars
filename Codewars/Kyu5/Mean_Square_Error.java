public class Mean_Square_Error {
    public static double solution(int[] arr1, int[] arr2) {
        int[] help = new int[arr1.length];
        double sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            help[i] = arr1[i] - arr2[i];
            sum += help[i]*help[i];
        }
        double result = (sum  / arr1.length);
        return result;
    }}
  