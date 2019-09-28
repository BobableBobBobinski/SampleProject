package lesson2;

import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float temp = sc.nextFloat();
        if(temp >= 36.4 && temp <= 36.7){
            System.out.println("Your temperature is okay");
            System.exit(0);
        }
        else{
            System.out.println("Not okay bro");
            System.exit(0);
        }
    }

}
