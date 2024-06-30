public class Not_very_secure{

    public static boolean alphanumeric(String s){
        if (s.isEmpty()) return false;

        return s.replaceAll("\\b[a-zA-Z0-9]+\\b", "").length() == 0 ? true : false;
    }

}