public class Buying_car {

    public static int[] nbMonths(double startPriceOld, double startPriceNew, double savingperMonth, double percentLossByMonth) {

        int count  = 0; double summa = startPriceOld; double result = -1;

        if (startPriceOld>=startPriceNew) return (new int[] {0, (int)Math.round(startPriceOld-startPriceNew)});

        while (result < 0){
            if(count % 2 == 1){
                percentLossByMonth +=0.5;
            }
            startPriceOld -= (startPriceOld * percentLossByMonth*0.01);
            startPriceNew -= (startPriceNew * percentLossByMonth*0.01);
            count++;
            summa = savingperMonth * count + startPriceOld;
            result = summa - startPriceNew;
        }
        return (new int[] {count, (int)Math.round(result)});
    }
}