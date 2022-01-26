package List;

import Entity.UserRegister;

public class UserRegisterList {
    private UserRegister[] userRegisters;
    private int emptyIndex = 0;

    public UserRegisterList(int count) {
        this.userRegisters = new UserRegister[count];
    }

    public void add(UserRegister userRegister) {
        userRegisters[emptyIndex] = userRegister;
        emptyIndex++;
    }

    public boolean checkUserLogin(String type, String username, String password) {
        for (int i = 0; i < emptyIndex; i++) {
            if (userRegisters[i].getType().equals(type) &&
                    userRegisters[i].getUsername().equals(username) &&
                    userRegisters[i].getPassword().equals(password))
                return true;
        }
        return false;
    }
}
