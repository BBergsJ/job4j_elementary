package ru.job4j.ex;

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
        if (!user.isValid()) {
            throw new UserInvalidException("Not valid!");
        } else if (user.getUsername().length() < 3) {
            throw new UserInvalidException("Less than 3!");
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
