package sg.edu.np.mad.practical2;

public class User {
    public String name;
    public String description;
    public int id;

    public boolean followed;

    public User(String username, String userDesc, int userId, boolean userFollowed){
        name = username;
        description = userDesc;
        id = userId;
        followed = userFollowed;
    }
}

