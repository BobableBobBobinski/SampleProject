package lesson1;

import java.util.Scanner;

public class NumbersWithTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = 0;
        while(num!=-1) {
            num = sc.nextInt();
            MultiTwo(num);
        }
    }
    public static long MultiTwo(long a){
        long num=a/2;
        if(num!=1 && num%2==0){
           num=num/2;


        }
        System.out.println("The number is multiple to 2");
        if(a%2!=0){
            System.out.println("The number isn't multiple to 2");
        }
        return a;
    }
}
