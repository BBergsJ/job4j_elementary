package ru.job4j.ex;

import com.sun.source.tree.IfTree;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User us = null;
        for (int i = 0; i < users.length; i++) {
            if (users[i].getUsername().equals(login)) {
                us = users[i];
                break;
            }
        }
        if (us == null) {
            throw new UserNotFoundException("User not found!");
        }
        return us;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid() || user.getUsername().length() < 3) {
            throw new UserInvalidException("Not valid or less than 3.");
        }
        return true;
    }

    public static void main(String[] args) {
        try {
            User[] users = {new User("Petr Arsentev", true)};
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException ui) {
            ui.printStackTrace();
        } catch (UserNotFoundException un) {
            un.printStackTrace();
        }
    }
}
