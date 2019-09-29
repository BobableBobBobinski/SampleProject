package lesson2;

public class Array {
    public static void main(String[] args) {
        int n = 10;
        int[] mas = new int[n];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = 666;
            System.out.println(mas[i]);
        }
        int a = average(mas);
        System.out.println("Average: " + a);
    }
    public static int average(int[] arr) {
        int count = 0;
        int sum = arr[0];
        int av;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            count = count + 1;
        }
        av = sum/count;
        return av;
    }
}
