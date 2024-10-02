import java.util.Arrays;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class CarMileage {

    public static int isInteresting(int number, int[] awesomePhrases) {
        System.out.println(number);
        System.out.println(Arrays.toString(awesomePhrases));
        int flag = 2;
        int count = 3;
        if (number < 98) return 0;
        if (number == 98 || number == 99) return 1;
        while (count > 0) {
            boolean upDown = true;

            Pattern pattern1 = Pattern.compile("^[1-9]0{2,}$");
            Pattern pattern2 = Pattern.compile("^[1-9]{3,}//b");
            Matcher matcher1 = pattern1.matcher(number + "");
            Matcher matcher2 = pattern2.matcher(number + "");

            if (matcher1.find() || matcher2.find()) {
                System.out.println(flag + " - шаблон");
                return flag;
            }
            String numberString = Integer.toString(number);
            char[] charArray = numberString.toCharArray();
            int[] intArray = new int[charArray.length];
            for (int i = 0; i < charArray.length; i++) {
                intArray[i] = Character.getNumericValue(charArray[i]);

            }
            if (intArray[0] == intArray[1] - 1) {
                for (int i = 1; i < intArray.length - 1; i++) {
                    if (intArray[i] == intArray[i + 1] - 1 || intArray[i] == intArray[i + 1]+9) {
                        continue;
                    }
                    else upDown = false; break;
                }
                if (upDown){
                    System.out.println(flag + " - возрастание");
                    return flag;}
            }
            upDown = true;

            if (intArray[0] == intArray[1] + 1) {
                for (int i = 1; i < intArray.length - 1; i++) {
                    if (intArray[i] == intArray[i + 1] + 1) {
                        continue;
                    }
                    else upDown = false; break;
                }
                if (upDown){
                    System.out.println(flag + " - убывание");
                    return flag;}
            }
            upDown = true;

            for (int i = 0, j = intArray.length - 1; i < j; i++, j--) {
                if (intArray[i] != intArray[j]) {
                    upDown = false; break;
                }
            }
            if (upDown){
                System.out.println(flag + " палиндром");
                return flag;
            }

            Set<Integer> idsSet = Arrays.stream(awesomePhrases).boxed().collect(Collectors.toSet());
            upDown = idsSet.contains(number);
            if (upDown){
                System.out.println(flag + " - присутствует в массиве");
                return flag;}
            number++;
            count--;
            flag = 1;
        }
        return 0;
    }
}