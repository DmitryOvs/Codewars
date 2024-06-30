
public class Image_host_filename_generator {
    public static String generateName(PhotoManager photoManager) {
        String str;
        String ff = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        do {
            str = "";
            for (int i = 0; i < 6; i++) {
                int g = (int) (Math.random() * ff.length());
                str += ff.charAt(g);
            }
        }
        while (photoManager.nameExists(str));
        return str;
    }
}