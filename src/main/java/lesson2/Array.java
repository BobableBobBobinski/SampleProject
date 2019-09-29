package lesson2;

import java.util.Random;

public class Array {
    public static void main(String[] args) {
        int n = 10;
        int[] mas = new int[n];
        Random r = new Random();
        int k = r.nextInt(151);
        for (int i = 0; i < mas.length; i++) {
            mas[i] = k;
            System.out.println(mas[i]);
        }
        float a = average(mas);
        System.out.println("Average: " + a);
    }
    public static float average(int[] arr) {
        int count = 0;
        int sum = arr[0];
        float av;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            count = count + 1;
        }
        av = sum/count;
        return av;
    }
}
