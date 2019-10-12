package homework3;

import java.util.Random;
import java.util.*;
public class SymDifOfSets {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Random rnd = new Random();
        for (Integer x : set1) {
            set1.add(rnd.nextInt(15));
        }
        for (Integer y : set2) {
            set2.add(rnd.nextInt(30));
        }
        for (Integer x : set1) {
            System.out.println(x);
        }
        System.out.println();
        for (Integer y : set2) {
            System.out.println(y);
        }
        System.out.println();
        symmetricDifference(set1, set2);
    }

    public static Set<Integer> symmetricDifference(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> newset = new HashSet<>();
        for (Integer x : set1) {
            for (Integer y : set2) {
                if(x.equals(y)) {
                    set1.remove(x);
                    set2.remove(y);
                }
            }
        }
        for (Integer x : newset) {
            newset.addAll(set1);
            newset.addAll(set2);
        }
        for (Integer x : newset) {
            System.out.println(x);
        }
        return newset;
    }
}
