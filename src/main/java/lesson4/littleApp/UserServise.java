package lesson4.littleApp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserServise {
    private Map<String, User> users;

    public UserServise() {
        users = new HashMap<>();
        User adminUser = new User("admin", "Bobich", "Bobi");
    }

    public User getByLogin (String login){
        if(users.containsKey(login)) {
            System.out.println(users.get(login));
        }
        return users.get(login);
    }
    public boolean addUser(User user) {
        if(!users.containsKey(user.getLogin())) {
            users.put(user.getLogin(), user);
            return true;
        } else {
            return false;
        }
    }

    public boolean deleteByLogin(String login) {
        if (users.containsKey(login)) {
            users.remove(login);
            return true;
        } else {
            return false;
        }
    }

    public List<User> getAllUsers() {
        System.out.println(users.values());
       return new ArrayList<>(users.values());
    }
    public User getByFullname(String fullname) {
        return users.get(fullname);
    }
    public boolean editUser(User user) {
        for (Map.Entry<String, User> pair : users.entrySet()) {
            if (pair.getKey().equals(user.getLogin())) {
                users.remove(user.getLogin());
                users.put(user.getLogin(), user);
                return true;
            }
        }
        return false;
    }
    public boolean auth(String login, String password) {
        if (users.containsKey(login)) {
            User user = users.get(login);
            if (users.containsKey(password)) {
                user = users.get(password);
            }
            return true;
        } else {
            return false;
        }
    }
}

