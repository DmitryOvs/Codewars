import java.util.*;

class What_Classy_Song{

    private String title;
    private String artist;
    private Set<String> set = new TreeSet<>(String::compareToIgnoreCase);

    public String getTitle() {
        return title;
    }
    public String getArtist() {
        return artist;
    }

    What_Classy_Song(String title, String artist){
        this.title = title;
        this.artist = artist;
    }

    public int howMany(ArrayList<String> ss){
        int begin = set.size();
        for (String f : ss) {
            set.add(f);
        }
        int end = set.size();
        return  end - begin;
    }
}