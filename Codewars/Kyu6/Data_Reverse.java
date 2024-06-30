public class Data_Reverse {
    public static int[] DataReverse(int[] data) {

        int[] data2 = new int[data.length];
        for (int i = 0; i < data.length/8; i++) {
            for (int j = i*8; j < 8 + i*8; j++) {
                data2[j] = data[data.length+j-8-8*i*2];
            }
        }
        return data2;
    }
}