package DSA.Step1LearnTheBasics.step2JavaCollections.A6Set.CopyOnWriteListSet;

import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetExample {
    public static void main(String[] args){
        CopyOnWriteArraySet<Integer> set = new CopyOnWriteArraySet<>();
        // the difference between CopyOnWriteArrayList and CopyOnWriteArraySet is CopyOnWriteArrayList can contain
        // same elements, but in CopyOnWriteArraySet there should be unique elements

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        System.out.println(set);

        for(int i:set){
            System.out.println(i);
            set.add(6); // it does not show 6 because the set add it after the iteration completed
                        // CopyOnWriteArraySet performs write operation on copy of original Array
        }
        // elements will be added after the iteration completed
        // CopyOnWriteArraySet does not perform write operations on an original set
        // it performs operations on copy of an original set and add it after the read operation

        // now we will take example of ConcurrentSkipListSet and CopyOnWriteArraySet
        ConcurrentSkipListSet<Integer> set1 = new ConcurrentSkipListSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        System.out.println(set1);

        for(int i : set1){
            System.out.print(i+" ");
            set1.add(6); // it shows element 6 at runtime because this set is thread safe
                         // but it does not guarantee that element is print at runtime
                         // there is 50-50 chance in some cases it does not print it
        }
        System.out.println();

        ConcurrentSkipListSet<Integer> set2 = new ConcurrentSkipListSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);
        set2.add(5);
        System.out.println(set2);
        // case when 6 is not print
        // ConcurrentSkipListSet is weakly consistent
        for(int i : set2){
            System.out.print(i+" ");
            if(i==5) set2.add(6);
        }
    }
}
