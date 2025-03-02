package DSA.Step1LearnTheBasics.step2JavaCollections.A5Map.A9ConcurrentSkipListMap;

import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipListMapExample {
    public static void main(String[] args) {
        ConcurrentSkipListMap<Integer, String> map = new ConcurrentSkipListMap<>();
        // (Thread safe TreeMap)
        // uses SkipList dataStructure to store data (uses BinarySearch to read and write)
        // it has all the methods of NavigableMap
        // ConcurrentSkipListMap -----> ConcurrentNavigableMap -------> ConcurrentMap, NavigableMap
        //                     (implements)                   (extends)
        // it does not use a red/black tree

    }
}
