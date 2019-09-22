package lesson1;


import java.util.Scanner;

public class justice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Show me your money: ");
        int num = scan.nextInt();
        System.out.println("Money: " + num);
        System.out.println("How much corn do you have to buy? ");
        int corn = scan.nextInt();
        int price = scan.nextInt();
        System.out.println(price);
        System.out.println("Amount of corn:" + corn);
        int count = num - corn * price;
        if(num<0 || corn < 0 || price < 0){
            System.exit(0);
        }
        if (count < 0) {
            System.out.println("Nah, bro, you ain't getting it");
        }
        if(count==0){
            System.out.println("You came close, pal, that's all you get");
        }

    }
}
