package lesson2;

import java.util.Scanner;

public class Authorization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       String a = sc.next();
        System.out.println("Now password:");
        String b = sc.next();
        boolean check = signIn(a, b);
        System.out.println("Answer: " + check);
    }
    public static boolean signIn(String login, String password){
        String correctpassword = "pupil";
        String correctlogin = "pupil";
        if(login.equals(correctlogin)){
            if(password.equals(correctpassword)){
                System.out.println("Yeah, you're right");
            } else {
                System.out.println("Wrong password!");
            }
            return true;
        } else {
         return false;
        }
    }
}
