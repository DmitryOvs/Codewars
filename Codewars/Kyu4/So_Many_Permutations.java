import java.util.*;

class So_Many_Permutations {

    public static List<String> singlePermutations(String s) {

        boolean[] flag = new boolean[s.length()];
        Set<String> res = new HashSet<>();
        rec(s, flag, "", res);

        return (new ArrayList<>(res));


    }
    private static void rec(String s, boolean[] flag, String curr, Set<String> res){
        if(s.length() == curr.length()){
            res.add(curr);
            return; }

        for (int i = 0; i < s.length(); i++) {
            if(!flag[i]){
                flag[i] = true;
                rec(s, flag, curr+s.charAt(i), res);
                flag[i] = false;
            }
        }
    }
}