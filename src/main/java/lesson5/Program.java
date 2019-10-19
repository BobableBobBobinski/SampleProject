package lesson5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        try (FileReader reader = new FileReader("C:\\Users\\pupil\\Desktop\\MPolina\\src\\main\\resources\\file.txt")) {

//            BufferedReader bufferedReader = new BufferedReader(reader);
//            String fromFile = bufferedReader.readLine();
            int sum = 0;
            int count = 0;
            Scanner sc = new Scanner(reader);
            while (sc.hasNextInt()) {
                int a = sc.nextInt();
                sum = sum + a;
                count = count + 1;
            }
            float end = sum/count;
            System.out.println("Answer " + end);
        } catch (IOException e) {
            System.out.println("Error! " + e.getMessage());
        }
    }
}

