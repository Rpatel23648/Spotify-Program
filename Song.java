public class Song implements Comparable<Object> {
    private String songName;
    private String artistName;
    private String duration;

    public Song(String songName, String artistName, String duration) {
        this.songName = songName;
        this.artistName = artistName;
        this.duration = duration;
    }

    public String getSongName() {
        return songName;
    }

    public String getDuration() {
        return duration;
    }

    public int compareTo(Object o) {
        if (o instanceof Song) {
            Song s = (Song) o;
            int nameCompare = this.songName.compareTo(s.songName);
            if (nameCompare != 0) {
                return nameCompare;
            }
            return this.artistName.compareTo(s.artistName);
        }
        return -1;
    }

    public String toString(){
        return songName + " by " + artistName + " (" + duration + ")";
    }
}
