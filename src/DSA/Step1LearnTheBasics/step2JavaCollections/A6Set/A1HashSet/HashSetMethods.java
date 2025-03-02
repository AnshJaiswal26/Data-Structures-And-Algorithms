package DSA.Step1LearnTheBasics.step2JavaCollections.A6Set.A1HashSet;

import java.util.*;

public class HashSetMethods {
    public static void main(String[] args){
        // it is similar to Map only small difference is there,set does not store key-value
        // pairs it contains only unique values
        // the working of HashMaps/Maps and HashSets are similar
        // since the Set implements Collections interface,
        // so it has methods (similar to List) like add,contains, isEmpty, remove, removeall, clear, and so on...
        HashSet<Integer> set = new HashSet<>();

        // it has the same hierarchy as the Maps
        // (Map hierarchy)
//         Map --> HashMap --> LinkedHashMap
//         Map & NavigableMap --> TreeMap
//         Map --> SequencedMap --> SortedMap --> NavigableMap --> TreeMap
//         Map --> ConcurrentMap --> ConcurrentHasMap
//         Map --> ConcurrentMap & NavigableMap --> ConcurrentNavigableMap --> ConcurrentSkipListMap

        // (Set hierarchy) little bit difference
//         Set --> HashSet --> LinkedHashSet
//         Set & NavigableSet --> TreeSet
//         SequencedSet & Set --> Sortedset --> NavigableSet --> TreeSet
//         Set & NavigableSet --> ConcurrentSkipListSet

        // Methods
        set.add(3);
        set.add(3);
        set.add(5);
        set.add(2);
        set.add(4);
        System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.contains(3));
        System.out.println(set.contains(5));
        System.out.println(set.contains(6));
        System.out.println(set.isEmpty());
        set.remove(3);
        System.out.println(set);
        System.out.println(set.size());

        // Here Map's keySet is also a Set
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"One");
        map.put(2,"Two");
        map.put(3,"Three");
        map.put(4,"Four");

        Set<Integer> set1 = map.keySet(); // map keys are also unique so List of keys are a Set

    }
}
