package DSA.Step1LearnTheBasics.step2JavaCollections.A6Set.A4NavigableSet;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableMapExample {
    public static void main(String[] args){
        NavigableSet<Integer> set = new TreeSet<>();
        set.add(4);
        set.add(3);
        set.add(5);
        set.add(1);
        System.out.println(set);

        System.out.println(set.descendingSet()); // Returns a reverse order view of the Set.
        System.out.println(set.ceiling(2));   // Returns the least element in this set greater than or equal to the given element, or null if there is no such element.
        System.out.println(set.floor(2));     // Returns the greatest element in this set less than or equal to the given element, or null if there is no such element.
        System.out.println(set.lower(3));     // Returns the greatest element in this set strictly less than the given element, or null if there is no such element.
        System.out.println(set.higher(3));    // Returns the least element in this set strictly greater than the given element, or null if there is no such element.
    }
}
