import java.util.*;
public class User {
    private String userName;
    private java.util.ArrayList<Playlist> playlists = new ArrayList<>();

    public User(String userName) {
        this.userName = userName;
    }

    public String getUsername(){
        return userName;
    }
    public Playlist addPlaylist(Playlist p){
        playlists.add(p);
        return p;
    }
    public ArrayList<Playlist> getPlaylist(){
        return playlists;
    }
    public Playlist getPlaylist(String playListTitle){
        for(Playlist p: playlists){
            if(p.getPlaylistTitle().equals(playListTitle)){
                return p;
            }
        }
        return null;
    }
    public Playlist removePlaylist(String name){
        for(Playlist p: playlists){
            if(p.getPlaylistTitle().equals(name)){
                playlists.remove(p);
                return p;
            }
        }
        return null;
    }
    public void makeCollaborativePlaylist(String playlistTitle, User friend){
        Playlist playlist = getPlaylist(playlistTitle);
        if(playlist != null){
            friend.addPlaylist(playlist);
        }
    }
}
