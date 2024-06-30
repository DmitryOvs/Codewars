public class LandPerimeter {

    public static String landPerimeter(String[] arr) {
        int lengthArr = arr.length;
        int lengthArrArr = arr[0].length();
        int perimetr = 0;

        String[][] arrNew = new String[lengthArr+2][lengthArrArr+2];

        for (int i = 0; i < lengthArr+2; i++) {
            for (int j = 0; j < lengthArrArr+2; j++) {
                if (i == lengthArr+1 || j == lengthArrArr+1 || i == 0 || j == 0) {
                    arrNew[i][j] = "O";
                } else {
                    arrNew[i][j] = String.valueOf(arr[i-1].charAt(j-1));
                }
            }
        }

        for (int i = 1; i < lengthArr+1; i++) {
            for (int j = 1; j < lengthArrArr+1; j++) {
                if (arrNew[i][j].equals("X")){
                    perimetr = perimetr + 4;
                    if (arrNew[i+1][j].equals("X")){
                        perimetr = perimetr -1;
                    }
                    if (arrNew[i][j+1].equals("X")){
                        perimetr = perimetr - 1;
                    }
                    if (arrNew[i-1][j].equals("X")){
                        perimetr = perimetr - 1;
                    }
                    if (arrNew[i][j-1].equals("X")){
                        perimetr = perimetr - 1;
                    }
                }
            }
        }
        return String.format("Total land perimeter: %d" , perimetr);
    }
}