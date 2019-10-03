package homework2;

import java.util.Scanner;

public class Respectful {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String saying = sc.next();
        String word = "Hello";
        int m = -10;
        while (m != 0)
            if (saying.startsWith(word)) {
                System.out.println("Do you want to exit?");
                m = sc.nextInt();
                if (m == 0) {
                    System.exit(0);
                } else {
                    continue;
                }
            } else {
                System.out.println("You're rude, go away >:/ ");
                System.exit(0);
            }
    }
}


