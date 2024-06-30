import java.util.ArrayList;
import java.util.List;

public class Warcraft_Series_I {

    public static List<String> generate(String path, int time) {

        List<String> result = new ArrayList<>();
        String[] array = path.split("");
        for (int i = 0; i < array.length; i++) {
            result.add(array[i]);
        }
        List<String> copyResult = new ArrayList<>(result);
        List<String> newList = new ArrayList<>();
        newList.add(path);

        for (int i = 0; i < time-1; i++) {
            List<String> clrearArr = new ArrayList<>();
            clrearArr.add(0, "M");
            for (int k = 1; k < result.size()-1; k++) {
                clrearArr.add(".");
            }
            clrearArr.add(result.size()-1, "B");

            for (int j = 0; j < result.size(); j++) {
                if (copyResult.get(j).equals("<")){
                    if (j-1 == 0) {
                        clrearArr.set(0, "*");
                    }else if (clrearArr.get(j-1).equals(">")){
                        clrearArr.set(j-1, "#");
                    }else{
                        clrearArr.set(j-1, "<");
                    }
                }
                else if (copyResult.get(j).equals(">")){
                    if (j+1 == clrearArr.size()-1){
                        clrearArr.set(result.size()-1, "*");
                    }else if (clrearArr.get(j+1).equals("<")){
                        clrearArr.set(j+1, "#");
                    }else {
                        clrearArr.set(j+1, ">");
                    }
                }
                else if (copyResult.get(j).equals("*")){
                    if (j == 0){
                        if (clrearArr.get(1).equals("<")){
                            clrearArr.set(1, "#");
                        }else{
                            clrearArr.set(1, ">");
                        }
                    }else if (j == clrearArr.size()-1) {
                        if (clrearArr.get(clrearArr.size() - 2).equals(">")) {
                            clrearArr.set(clrearArr.size() - 2, "#");
                        } else {
                            clrearArr.set(clrearArr.size() - 2, "<");
                        }
                    }
                }
                else if (copyResult.get(j).equals("#")){
                    if (j == 1){
                        clrearArr.set(0, "*");
                        if (clrearArr.get(2).equals("<")) clrearArr.set(2, "#");
                        else clrearArr.set(2, ">");
                    }else if (j == clrearArr.size()-2) {
                        clrearArr.set(clrearArr.size() - 1, "*");
                        if (clrearArr.get(clrearArr.size() - 3).equals(">")) clrearArr.set(clrearArr.size() - 3, "#");
                        else clrearArr.set(clrearArr.size() - 3, "<");
                    }else {
                        if (clrearArr.get(j-1).equals(">")) clrearArr.set(j-1, "#");
                        if (clrearArr.get(j-1).equals("."))clrearArr.set(j-1, "<");
                        if (clrearArr.get(j+1).equals("<"))clrearArr.set(j+1, "#");
                        if (clrearArr.get(j+1).equals("."))clrearArr.set(j+1, ">");
                    }
                }
            }
            copyResult.clear();
            copyResult.addAll(clrearArr);
            String str = String.join("", clrearArr);
            newList.add(str);
        }
        return newList;
    }
}