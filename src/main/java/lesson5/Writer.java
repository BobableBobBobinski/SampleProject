package lesson5;

import java.io.FileWriter;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner;

public class Writer {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("src\\main\\resources\\file1", false)) {
            Random rnd = new Random();


            for (int i = 0; i < 15; i++) {
                Integer numbers = rnd.nextInt(10);
                writer.write(String.valueOf(numbers) + " ");
            }
            writer.flush();
            // flush() - writing all remembered things in the file at once
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
