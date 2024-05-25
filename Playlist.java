import java.util.*;
public class Playlist {
    private String playlistTitle;
    private ArrayList<Song> songs = new ArrayList<>();
    public Playlist(String playlistTitle){
        this.playlistTitle = playlistTitle;
    }
    public String getPlaylistTitle(){
        return playlistTitle;
    }
    public void setTitle(String playlistTitle){
        this.playlistTitle = playlistTitle;
    }
    public Song addSong(Song s){
        songs.add(s);
        return s;
    }
    public Song removeSong(String songTitle){
        for(Song s: songs){
            if(s.getSongName().equals(songTitle)){
                songs.remove(s);
                return s;
            }
        }
        return null;
    }
    public Song removeSong(Song s){
        songs.remove(s);
        return s;
    }
    public void swapSongs(Song song1, Song song2){
        Song temp;
        int index1 = songs.indexOf(song1);
        int index2 = songs.indexOf(song2);
        if(songs.contains(song1) && songs.contains(song2)){
            temp = songs.get(index1);
            songs.set(index1, songs.get(index2));
            songs.set(index2, temp);
        }
    }
    public String totalRuntime(){
        int totalSeconds = 0;
        for(Song s: songs){
            String[] durationParts = s.getDuration().split(":");
            int minutes = Integer.parseInt(durationParts[0]);
            int seconds = Integer.parseInt(durationParts[1]);
            totalSeconds += minutes * 60 + seconds;
        }
        int totalMinutes = totalSeconds / 60;
        int remainingSeconds = totalSeconds % 60;
        return totalMinutes + " min, " + remainingSeconds + " sec";
    }
    public void sortSongs(){
        songs.sort((o1, o2) -> o1.compareTo(o2));
    }
    public String toString(){
        String str = playlistTitle + " - " + totalRuntime() + "\n" ;
        int i = 1;
        for(Song s: songs){
            String nums = Integer.toString(i);
            str += nums + ". " + "" + s.toString() + "\n";
            i++;
        }
        return str;
    }
}
