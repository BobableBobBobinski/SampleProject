package lesson4.littleApp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserServise {
    private Map<String, User> users;
    private final String PATH_TO_FILE = "src\\main\\resources\\users";
    public UserServise() {
        users = FileHelper.readFrom(PATH_TO_FILE);
    }
    public void saveData() {
        FileHelper.saveTo(PATH_TO_FILE, users);
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

    public List<User> getAllUsers() { //change it to admin-only rights
        System.out.println(users.values());
       return new ArrayList<>(users.values());
    }
    public User getByFullname(String fullname) {
        if(users.containsKey(fullname)) {
            System.out.println(users.get(fullname));
        }
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

