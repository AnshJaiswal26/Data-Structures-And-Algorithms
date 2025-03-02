package DSA.Step1LearnTheBasics.step2JavaCollections.A5Map.A4NavigableMap;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapExample {
    public static void main(String[] args){
        // A SortedMap extended with navigation methods returning the closest matches for given search targets.
        // Methods lowerEntry, floorEntry, ceilingEntry, and higherEntry return Map. Entry objects associated with keys respectively less than,
        // less than or equal, greater than or equal, and greater than a given key, returning null if there is no such key. Similarly, methods lowerKey,
        // floorKey, ceilingKey, and higherKey return only the associated keys. All of these methods are designed for locating, not traversing entries.
        NavigableMap<Integer,String> map = new TreeMap<>();
        map.put(4,"Bob");
        map.put(3,"Jack");
        map.put(5,"Roy");
        map.put(1,"Alice");
        System.out.println(map);

        System.out.println(map.descendingMap()); // Returns a reverse order view of the mappings contained in this map.
        System.out.println(map.ceilingKey(2));  // Returns the least key greater than or equal to the given key, or null if there is no such key.
        System.out.println(map.floorKey(2)); // Returns the greatest key less than or equal to the given key, or null if there is no such key.
        System.out.println(map.lowerKey(3)); // Returns the greatest key strictly less than the given key, or null if there is no such key.
        System.out.println(map.higherKey(3)); // Returns the least key strictly greater than the given key, or null if there is no such key.
    }
}
