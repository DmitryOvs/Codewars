
public class Product_consecutive_Fib_numbers { // must be public for codewars

    public static long[] productFib(long prod) {
        System.out.println(prod);
        long[] currect = new long[3];
        long n0 = 1;
        long n1 = 1;
        long n2;

        for(int i = 3; i <= 55; i++){
            n2 = n0 + n1;

            if (prod/n0 == n1){
                currect[0] = n0;
                currect[1] = n1;
                currect[2] = 1;
                break;
            }
            if (prod/n1 < n0 ){
                currect[0] = n0;
                currect[1] = n1;
                currect[2] = 0;
                break;
            }
            if (prod/n1 < n1 ){
                currect[0] = n1;
                currect[1] = n2;
                currect[2] = 0;
                break;
            }
            n0 = n1;
            n1 = n2;
        }
        return currect;
    }
}