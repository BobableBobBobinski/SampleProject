package lesson3;

import com.github.javafaker.Faker;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Faker faker = new Faker(new Locale("ru"));
        for (int i = 0; i <20 ; i++) {
            System.out.println(faker.cat().name());

        }
    }
}
