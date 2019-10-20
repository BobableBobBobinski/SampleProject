package lesson4.littleApp;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class FileHelper {
    public static Map<String, User> readFrom(String path) {
        Map<String, User> map = new HashMap<>();
        try (FileReader reader = new FileReader(path)){
            Scanner sc = new Scanner(reader);
            while (sc.hasNext()) {
                String login = sc.next();
                String password = sc.next();
                String fname = sc.next();
                User user = new User(login, password, fname);
                map.put(login, user);
            }

        } catch (IOException e) {
           e.printStackTrace();
        }
        return map;
    }

    // realise both methods using file (key - login)
    public static void saveTo(String path, Map<String, User> users) {
        try (FileWriter writer = new FileWriter(path, false)){
            for (User x : users.values()) {
               String text  = x.getLogin() + " " + x.getPassword() + " " + x.getFullName();
               writer.write(text + " ");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
