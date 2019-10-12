package homework3;

import com.github.javafaker.Faker;

import java.util.*;

public class DeleterN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        int  n = sc.nextInt();
        Faker faker = new Faker(new Locale("ru"));
        for (int i = 0; i < 10; i++) {
            list.add(faker.cat().breed());
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println();
        DeleteLong(list, n);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
    public static void DeleteLong(List <String> list, int n) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() > n) {
                list.remove(list.get(i));
                i = i - 1;
            }
        }
    }
}
