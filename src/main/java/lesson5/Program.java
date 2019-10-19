package lesson5;

import lesson4.littleApp.User;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        List<User> list = new ArrayList<>();
        try (FileReader reader = new FileReader("C:\\Users\\pupil\\Desktop\\MPolina\\src\\main\\resources\\file.txt")) {

//            BufferedReader bufferedReader = new BufferedReader(reader);
//            String fromFile = bufferedReader.readLine();

            Scanner sc = new Scanner(reader);

            while (sc.hasNext()) {
                String a = sc.next();
                String b = sc.next();
                String c = sc.next();
                User user = new User(a, b, c);
                list.add(user);

            }

        } catch (IOException e) {
            System.out.println("Error! " + e.getMessage());
        } catch (NoSuchElementException m) {
            System.err.println("ErRorrrr!\n");
        }
        for (User x : list) {
            System.out.println(x);
        }
    }
}

