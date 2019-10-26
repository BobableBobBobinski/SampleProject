package homework4;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MathChecker {
    public static void main(String[] args) {

        try(FileReader reader = new FileReader("src\\main\\resources\\numbersHomework")) {
            Scanner sc = new Scanner(reader);
            List<Float> list = new ArrayList<>();
            while (sc.hasNext()) {
               float a = sc.nextFloat();
               list.add(a);
            }
            System.out.println("Numbers: " + list);
            for (int i = 0; i < list.size(); i++) {
                if (i != list.size() - 2) {
                    if (Float.compare((list.get(i + 1) - list.get(i)), (list.get(i + 2) - list.get(i + 1))) == 0) {
                        System.out.println("It's arithmetic progression");
                        break;
                    }
                    if (Float.compare((list.get(i + 1) / list.get(i)), (list.get(i + 2) / list.get(i + 1))) == 0) {
                        System.out.println("It's geometric progression");
                        break;
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error!" + e.getMessage());
        } catch (IOException e) {
            System.err.println("ERROR!\n");
        }
    }
}