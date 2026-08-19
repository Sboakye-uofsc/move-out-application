/**
 * User
 */
public class User {

    protected String username;
    protected String password;
    protected String type;

    public User() {
        this.username = "";
        this.password = "";
        this.type = "";

    }

    public User(String username, String password){
        this.username = username;
        this.password = password;
        this.type = type;
    }

    public String getUsername(){
        return username;
    }

    public String getPassword(){
        return password;
    }

    //Remember to add right password or password check
}