public class L3375p34k extends Encoder{

    public String encode(String source){

        if (source == null) return "";
        if (source.isEmpty()) return "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < source.length(); i++) {
            switch (source.charAt(i)){
                case 'a', 'A': sb.append("4"); break;
                case 'e', 'E': sb.append("3"); break;
                case 'l', 'L': sb.append("1"); break;
                case 'm', 'M': sb.append("/^^\\"); break;
                case 'o', 'O': sb.append(0); break;
                case 'u', 'U': sb.append("(_)"); break;
                default  : sb.append(source.charAt(i));  }
        }
        return sb.toString();}
}
abstract class Encoder{
    public abstract String encode(String source);
}

