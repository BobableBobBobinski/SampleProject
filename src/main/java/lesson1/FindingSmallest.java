package lesson1;

import java.util.Scanner;

public class FindingSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write the 1 number: ");
        int num1 = sc.nextInt();
        System.out.println("Write the 2 number: ");
        int num2 = sc.nextInt();
        System.out.println("Write the 3 number: ");
        int num3 = sc.nextInt();
        minFromThree(num1, num2, num3);
    }
    public static int minFromThree(int a, int b, int c){
        if(a < b && a < c) {
            return a;
        }
        if(b < c && a > b) {
            return b;
        }
        if(c < a && c < b) {
            return c;
        }
        return a;
    }

}
