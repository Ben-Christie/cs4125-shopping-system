package Database.DBEntity;

public class UserDBEntity {

    private int userId;
    private String email;
    private String password;

    public UserDBEntity(int userId, String email, String password) {
        this.userId = userId;
        this.email = email;
        this.password = password;
    }

    public int getUserId() {
        return userId;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
