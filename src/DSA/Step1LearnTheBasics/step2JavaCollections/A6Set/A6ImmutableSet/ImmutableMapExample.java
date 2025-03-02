package DSA.Step1LearnTheBasics.step2JavaCollections.A6Set.A6ImmutableSet;

import java.util.*;

public class ImmutableMapExample {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        Set<Integer> set2 = Collections.unmodifiableSet(set1);
        // Returns an unmodifiable view of the specified Set. Query operations on the returned Set "read through" to the specified Set,
        // and attempts to modify the returned Set, whether direct or via its collection views, result in an UnsupportedOperationException.

        // set1.add(4); // it throws an exception because set2 is an unmodifiable/immutable view of set1,
        // but this is a disadvantage of this because we can modify set1,
        // so here comes Set.of() and Set.ofEntries() methods to achieve a pure immutable Set

        Set<Integer> Set3 = Set.of(1,2,3); // Set.of() methods can store more than 10 elements it is different from Map.of() capacity

    }
}
