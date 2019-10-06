package lesson3;

import com.github.javafaker.Faker;
import lesson2.Array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class ArrayListExample {
    public static void main(String[] args) {
        Faker faker = new Faker(new Locale("ru"));
        ArrayList<String> list = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < 10; i++) {
            list.add(faker.chuckNorris().fact());
        }
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).startsWith("Chuck Norris")) {
                count = count + 1;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println();
        System.out.println("The ammount of facts starting with his name: " + count);
        System.out.println();

        Set<String> strings = new HashSet<>(list);
        for (String x : strings) {
            System.out.println(x);

        }
    }
}
