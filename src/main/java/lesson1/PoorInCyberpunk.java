package lesson1;

import java.util.Scanner;

public class PoorInCyberpunk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int coin = sc.nextInt();
        int count = 0;
        while (coin != 0){
            System.out.println("All coins: " + coin);
            if(coin != 1 || coin != 2 || coin != 5 || coin != 10){
                System.out.println("Wrong! Try again pls");
            }
            else {
                count = count + coin;
            }
            count = count + coin;
        }
        System.out.println("You found " + count + " money! Congratulations");
    }

}
