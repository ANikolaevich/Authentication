import java.util.HashMap;

public class User {


    private static HashMap<String, User> userList = new HashMap<>();
    private String userName;
    private String password;
    private String userEMail;

    public User() {

    }

    public User(String userEMail, String userName, String password, User user) {
        this.userEMail = userEMail.toLowerCase();
        this.password = password;
        this.userName = userName.toLowerCase();
        this.userList.put(userName, user);
    }
    public String getUserName() {
        return userName;
    }

    public void setUserName(String name) {
        this.userName = name.toLowerCase();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserEMail() {
        return userEMail;
    }

    public void setUserEMail(String userEMail) {
        this.userEMail = userEMail.toLowerCase();
    }

    public static HashMap<String, User> getUserList() {
        return userList;
    }

    public void setUserList(String userName, User user) {
        this.userList.put(userName, user);
    }
}
