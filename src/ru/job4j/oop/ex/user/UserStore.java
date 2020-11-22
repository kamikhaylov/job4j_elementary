package ru.job4j.oop.ex.user;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User result = null;
        for (User user : users) {
            if (login.equals(user.getUserName())) {
                result = user;
            }
        }
        if (result == null) {
            throw new UserNotFoundException("Пользователь не найден");
        }
        return result;
    }

    public static boolean validate(User user) throws UserInvalidException {
        boolean result = true;
        if (user.getUserName().length() < 3 || !user.isValid()) {
            throw new UserInvalidException("Пользователь не валидный");
        }
        return result;
    }

    public static void main(String[] args) {
        User[] users = {new User("Petr Arsentev", true)};
        try {
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException ex) {
            ex.printStackTrace();
        } catch (UserNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}