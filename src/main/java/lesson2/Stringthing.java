package lesson2;

import java.util.Scanner;

public class Stringthing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int num = 0;
        System.out.print(str);
        System.out.println();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='!') {
                num++;
            }
        }
        System.out.println(num);
        System.out.println();
        for (int i = str.length() - 1; i > -1; i--) {
            System.out.print(str.charAt(i));
        }
    }
}
