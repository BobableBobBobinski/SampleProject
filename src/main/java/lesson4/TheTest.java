package lesson4;

import java.util.ArrayList;
import java.util.List;

public class TheTest {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            a.add(i);
        }
        int c = 0;
        List<Integer> b = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            a.add(c);
        }
        System.out.println(compareTriplets(a, b));
    }
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
    
}
