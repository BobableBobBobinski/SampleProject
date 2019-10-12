package homework3;

import com.github.javafaker.Faker;

import java.util.*;

public class CountingStrings {
    public static void main(String[] args) {
        Faker faker = new Faker(new Locale("ru"));
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(faker.cat().breed());
        }
        Map<String, Integer> map = countInList(list);
        System.out.println(map);
    }

    public static Map<String, Integer> countInList(List<String> list) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        String word_1, word_2;
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            word_1 = list.get(i);
            count = 1;
            for (int j = i + 1; j < list.size(); j++) {
                word_2 = list.get(j);
                if (word_1.equals(word_2)) {
                    count++;
                    list.remove(j);
                    j--;
                }
            }
            map.put(word_1,count);
        }
        return map;
    }
}
