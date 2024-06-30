
public class Maximum_subarray_sum {
    public static int sequence(int[] arr) {
        int sum = 0;
        int peremR = 0;
        int peremL = 0;
        int countP = -1;
        int perem = 0;

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];
            if (sum > perem){
                perem = sum;
                peremL = countP + 1;
                peremR = i;
            }
            if (sum<0){
                sum = 0;
                countP = i;
            }
        }
        return perem;
    }
}