import java.util.*;

public class Recover_secret {

    public String recoverSecret(char[][] triplets) {

        Set<Character> setArr = new HashSet<>();
        for (char[] c : triplets) {
            for (char a : c){
                setArr.add(a);
            }
        }
        List<Character> listArr = new ArrayList<>();
        listArr.addAll(setArr);

        for (int t = 0; t < 5; t++) {
            for (int i = 0; i < triplets.length; i++) {
                int m = listArr.indexOf(triplets[i][2]);
                int n = listArr.indexOf(triplets[i][1]);
                if (m < n) {
                    Collections.swap(listArr,m,n);
                }
                int k = listArr.indexOf(triplets[i][1]);
                int l = listArr.indexOf(triplets[i][0]);
                if (k < l) {
                    Collections.swap(listArr,k,l);
                }
            }
        }
        return String.join(" ", String.valueOf(listArr)).replaceAll("[\\[ \\] \\ ,]", "");
    }

}