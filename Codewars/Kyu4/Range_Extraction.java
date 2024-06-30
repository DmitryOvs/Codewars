class Range_Extraction {
    public static String rangeExtraction(int[] arr) {
        StringBuilder h = new StringBuilder();
        int i = 0, j = 0;
        while (i < arr.length) {
            while (++j < arr.length && arr[j] - arr[j - 1] == 1);
            if (j - i > 2) {
                h.append(String.format("%s-%s,", arr[i], arr[j - 1]));
                i = j;
            } else {
                for (; i < j; i++)
                    h.append(String.format("%s,", arr[i]));
            }
        }
        return h.substring(0, h.length()-1);
    }
}