package DSA.Step1LearnTheBasics.step2JavaCollections.A6Set.A5ConcurrentSkipListSet;

import java.util.concurrent.ConcurrentSkipListSet;

public class ConcurrentSkipListMapExample {
    public static void main(String[] args) {
        ConcurrentSkipListSet<Integer> Set = new ConcurrentSkipListSet<>();
        // (Thread safe TreeSet)
        // uses SkipList dataStructure to store data (uses BinarySearch to read and write)
        // it has all the methods of NavigableSet
        // Set & NavigableSet --> ConcurrentSkipListSet
        // it does not use a red/black tree

        // here we can use Collections.synchronizedSet() but it highly reduces the performance
        // instead of this synchronized set recommended ConcurrentSkipListSet. it is just for information
    }
}
