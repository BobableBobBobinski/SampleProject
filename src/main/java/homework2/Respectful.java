package homework2;

import java.util.Scanner;

public class Respectful {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String saying = sc.next();
        String word = "Hello";
        if (saying.startsWith(word)) {
            System.out.println("Nice :) ");
        } else {
            System.out.println("You're rude, go away >:/ ");
        } System.out.println("Goodbye");
            System.exit(0);
    }
}


