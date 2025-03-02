package DSA.Step1LearnTheBasics.step2JavaCollections.A6Set.A2LinkedHashSet;

import java.util.LinkedHashSet;

public class LinkedHashSetMethods {
    public static void main(String[] args){
        LinkedHashSet<Integer> set = new LinkedHashSet<>(12,0.75f); // same as Map
        // here LinkedHashSet are used to store data in given order

        // here are the methods of LinkedHashSet
        set.add(3);
        set.add(3);
        set.add(5);
        set.add(2);
        set.add(4);
        System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.contains(3));
        System.out.println(set.contains(5));
        set.remove(3);
        set.removeFirst();
        set.removeLast();
        set.clear();
        System.out.println(set.isEmpty());
        // ......... and so on
    }
}
