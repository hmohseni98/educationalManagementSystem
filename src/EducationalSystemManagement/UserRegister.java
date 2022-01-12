package EducationalSystemManagement;

public class UserRegister {
    private String type;
    private String username;
    private String password;

    public UserRegister(String type, String username, String password) {
        this.type = type;
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
