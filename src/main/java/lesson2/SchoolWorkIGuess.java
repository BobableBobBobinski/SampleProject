package lesson2;

import java.util.Scanner;

public class SchoolWorkIGuess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float num = (float) 2.5;
        float check = (float) 0.01;
        while (a != 0) { //forever going cycle, change it at home!
            if(a <= num+check && a >= num-check) {
                System.out.println("Yeah, u get 5 for ur work");
            } else {
                System.out.println("U r stupid, get mark 2 and suffer haha");

            }
        }
    }
}
