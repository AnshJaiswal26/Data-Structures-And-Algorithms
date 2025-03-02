package DSA.Step1LearnTheBasics.step2JavaCollections.A5Map.A12ImmutableMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapExample {
    public static void main(String[] args) {
        Map<Character,Integer> map = new HashMap<>();
        map.put('a',1);
        map.put('d',2);
        map.put('c',3);
        Map<Character,Integer> map2 = Collections.unmodifiableMap(map);
        // Returns an unmodifiable view of the specified map. Query operations on the returned map "read through" to the specified map,
        // and attempts to modify the returned map, whether direct or via its collection views, result in an UnsupportedOperationException.

//        map1.put('d',4); // it throws an exception because map2 is an unmodifiable/immutable view of map1,
        // but this is a disadvantage of this because we can modify map1
        // so here comes map.of() and map.ofEntries() methods to achieve a pure immutable map

        Map<Character,Integer> map3 = Map.of('a',1,'b',2,'c',3); // map.of() methods can store limited pairs (Only 10 pairs can be added)
        // Map.ofEntry() can stores many pairs
        Map<Character,Integer> map4 = Map.ofEntries(Map.entry('a',1),Map.entry('b',2),Map.entry('c',3));
    }
}
