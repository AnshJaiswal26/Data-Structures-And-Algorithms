package DSA.Step1LearnTheBasics.step2JavaCollections.A5Map.A8ConcurrentHashMap;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public static void main(String[] args) {
        // A hash table supporting full concurrency of retrievals and high expected concurrency for updates.
        // This class obeys the same functional specification as Hashtable, and includes versions of methods corresponding to each method of Hashtable.
        // However, even though all operations are thread-safe, retrieval operations do not entail locking, and there is not any support for locking the entire table
        // in a way that prevents all access. This class is fully interoperable with Hashtable in programs that rely on its thread safety but not on its synchronization details.

        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();   // (all the methods are the same as Hashtable)
                                                                              // Incremental resizing add only one bucket everytime when size exceeds
                                                                              // it is Thread safe and faster than Hashtable
        // Java 7 --> Segments based locking --> 16 segments --> smaller maps
        // Only the segment is locked in which the write or read operation is performed
        // Read: do not require locking unless there is a write operation happening on the same segment.
        // Write: only the segment is locked where the write operation is preformed.
        // Disadvantage --> take longer time to produce results if the map size is bigger

        // Java 8 --> no segmentation
        // compares and swaps approach --> no locking except resizing or collision (particular bucket is locked when collision occurs)
        //
    }
}
