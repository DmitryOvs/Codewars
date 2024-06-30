import java.util.Random;

public class Color_Ghost {

    final String[] colors = { "white", "yellow", "purple", "red" };

    public String getColor() {
        Random random = new Random();
        int index = random.nextInt(colors.length);
        return colors[index];
    }

    public class ColorGhost {

        public static void main(String[] args) {

            Color_Ghost ghost = new Color_Ghost();
            ghost.getColor();
        }
    }
}