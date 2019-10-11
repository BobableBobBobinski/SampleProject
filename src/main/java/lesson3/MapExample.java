package lesson3;

import com.github.javafaker.Faker;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Random;

public class MapExample {
    public static void main(String[] args) {
        Faker faker = new Faker(new Locale("ru"));
        Map<String, Integer> map = new HashMap<>();
        map.put("Masya", 2); //если ввести что-то в тот же ключ, то данные в ключе заменятся на новые
        Integer a = map.get("Masya");
        Double b = 5.3441;
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            map.put(faker.cat().name(), rnd.nextInt(50));
        }
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            String key = pair.getKey();
            Integer value = pair.getValue();
            System.out.println(key+ " : " + value);
        }
    }
}
