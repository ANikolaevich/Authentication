import java.util.Locale;

public class User {

    private String userName;
    private String password;
    private String userEMail;

    public User() {

    }

    public User(String userEMail, String userName, String password) {
        this.userEMail = userEMail.toLowerCase();
        this.password = password;
        this.userName = userName.toLowerCase();
    }
    public String getUserName() {
        return userName;
    }

    public void setUserName(String name) {
        this.userName = name;
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
        this.userEMail = userEMail;
    }
}
