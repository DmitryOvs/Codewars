import java.util.Arrays;

class GapInPrimes {

    public static long[] gap(int g, long m, long n) {

        long[] primes = generator(m,n);
        for (int i=0; i<primes.length-1;i++) {
            if(primes[i]>=m && primes[i]==primes[i+1]-g)
                return Arrays.copyOfRange(primes,i,i+2);
        }
        return null;
    }
    private static long[] generator(long m, long n) {
        long[] primes = new long[(int)(n-m)];
        int numPrimes = 0;
        boolean prime = true;
        for (int i =(int)m; i<(int)n; i++) {
            prime = true;
            for (int j = 2; j<Math.sqrt((double)i)+1;j++) {
                if(i%j==0) {prime=false; break;}
            }
            if(prime) {primes[numPrimes]=(long)i; numPrimes++;}
        }
        return Arrays.copyOfRange(primes,0,numPrimes);
    }

    private static long[] seive(long m, long n) {

        long[] primes = new long[(int)n/2+1];
        long j = 3;
        long newJ = 0;
        primes[0] = 1; primes[1]=2;
        for (int i = 2; i<=(int)(n+1)/2; i++){
            primes[i] = (long)(2L *i)-1;
        }
        while (j<n) {
            for (int i = (int)n/2; primes[i]>j; i--){
                if (primes[i]%j==0) {
                    primes[i]=0;
                }
                else if(primes[i] > j) {newJ = primes[i];}
                else continue;
            }
            Arrays.sort(primes);
            if(j == newJ) {j++;} else j=newJ;
        }
        for(int index = 0; index < n/2+1;index++) {
            if (primes[index]>=m) {
                primes = Arrays.copyOfRange(primes,index,(int)n/2+1);
                break;
            }
        }
        return primes;
    }
}