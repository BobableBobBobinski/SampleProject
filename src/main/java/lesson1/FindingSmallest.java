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
        if(num1 == num2 && num2 == num3){
            System.out.println("All numbers are equal");
        }
        else {
            if (num1 >= num2 && num2 <= num3) {
                System.out.println("The min is " + num2);
            }
            if (num2 >= num1 && num1 <= num3) {
                System.out.println("The min is " + num1);
            }
            if (num1 >= num3 && num3 <= num2) {
                System.out.println("The min is " + num3);
            }
        }
    }

}
