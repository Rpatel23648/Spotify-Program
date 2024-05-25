import java.util.*;
public class MusicService {
    private static ArrayList<User> users = new ArrayList<>();
    public static void addUser(User user){
        users.add(user);
    }
    public void removeUser(User user){
        users.remove(user);
    }
    public static ArrayList<Playlist> getUserPlaylists(User username){
        return username.getPlaylist();
    }
}
