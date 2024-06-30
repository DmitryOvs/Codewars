import java.util.*;
public class Human_readable {

    public static String formatDuration(int seconds) {

        if (seconds == 0) return "now";

        long year = seconds/(365*24*60*60);
        long day = (seconds - year*365*24*60*60) / (24*60*60);
        long hour = (seconds - year*365*24*60*60 - day*24*60*60) / (60*60);
        long min = (seconds - year*365*24*60*60 - day*24*60*60 - hour*60*60) / 60;
        long sec = seconds - year*365*24*60*60 - day*24*60*60 - hour*60*60 - min*60;
        List<String> str = new ArrayList<>();
        String y = "";
        String d = "";
        String h = "";
        String m = "";
        String s = "";


        if (year > 0){
            if (year>1) y = String.format(year + " years");
            else y = String.format(year + " year");
            str.add(y);
        } if (day > 0) {
            if (day >1) d = String.format(day + " days");
            else d = String.format(day + " day");
            str.add(d);
        } if (hour > 0) {
            if (hour > 1) h = String.format(hour + " hours");
            else h = String.format(hour + " hour");
            str.add(h);
        } if (min > 0) {
            if (min > 1) m = String.format(min + " minutes");
            else m = String.format(min + " minute");
            str.add(m);
        } if (sec > 0) {
            if (sec > 1)s = String.format(sec + " seconds");
            else s = String.format(sec + " second");
            str.add(s);
        }
        if (str.size()>1){
            str.add(str.size()-1, "and");
        }
        String j = str.toString().replace("[", "")
                .replace("]", "")
                .replace(", and,",  " and");
        return j;
    }
}