package lesson5;

import java.util.*;

public class TheTest {
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List <Integer> list = new ArrayList<>();
        list.add(0);
        list.add(0);
        for (int i = 0; i < 3; i++) {
            if(a.get(i) > b.get(i)) {
                if (a.get(i) != b.get(i)) {
                    list.set(0, list.get(0) + 1);
                } else {
                    list.set(1, 1);
                    break;
                }
            } else {
                list.set(1, list.get(1) + 1);
            }
        }
        return list;
    }

    static String kangaroo(int x1, int v1, int x2, int v2) {
        int s1 = x1;
        int s2 = x2;
        int count = 0;
        if (x1 > x2 && v1 < v2) {

            while (true) {
                if(s1 < s2) {
                    break;
                }
                s1 = x1 + v1;
                s2 = x2 + v2;
                if(s1 == s2) {
                    count++;
                    break;
                }
            }
        }
        if (x1 < x2 && v1 > v2) {
            while (true) {
                if(s1 > s2) {
                    break;
                }
                s1 = x1 + v1;
                s2 = x2 + v2;
                if(s1 == s2) {
                    count++;
                    break;
                }
            }
        }
        if (x1 == x2 && v1 == v2) {
            count++;
        }
        if (count != 0) {
            return "YES";
        } else {
            return "NO";
        }
    }




    static int designerPdfViewer(int[] h, String word) {
        int max = 0;
        for (int i = 0; i < word.length(); i++) {
            int index = ((int) word.charAt(i) - 97);
            int height = h[index];
            if (height > max) {
                max = height;
            }
        }
        return word.length()*max;
    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int[] mas = new int[5];
//        int b = 5;
//        int a = sc.nextInt();
//        int c = b/a;
//        try {
//            System.out.println(c);
//        } catch (Exception ch) {
//            System.out.println("Wrong numbers");
//            System.out.println(ch.getMessage());
//        }
//        try {
//            a = 0;
//        } catch (InputMismatchException e) {
//            e.printStackTrace();
//        }
//
//        //if try finds mistake with 1 catch, it ends (so no checking 2 catch)
//       // int[] mas = new int[Integer.MAX_VALUE];
//        // don't overdo try, make another one
//        //in Throwable there're errors and exceptions (checkable). Errors are uncatchable (memory overflow)
//        //Exceptions --> RunTimeException is uncheckable
//
//    }
    static int migratoryBirds(List<Integer> arr) {

        Map<Integer, Integer> map = new HashMap<>();
        Integer value = 1;
        Integer maxvalue = 0;

        for (int i = 0; i < arr.size(); i++) {
            if (map.containsKey(arr.get(i))) {
                map.put(arr.get(i), map.get(arr.get(i)) + 1);
            } else {
                map.put(arr.get(i), 1);
            }
        }

        for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " : " + pair.getValue());
            if (pair.getValue() > maxvalue) {
                maxvalue = pair.getKey();
            }
        }
        System.out.println("Max v " + maxvalue);
        return maxvalue;
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(3);
        numbers.add(3);
        numbers.add(3);
        numbers.add(3);
        numbers.add(5);
        numbers.add(1);
        numbers.add(1);
        numbers.add(1);
        numbers.add(1);
        migratoryBirds(numbers);
    }


}
