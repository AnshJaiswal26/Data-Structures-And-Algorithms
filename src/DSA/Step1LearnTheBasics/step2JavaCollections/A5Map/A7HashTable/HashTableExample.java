package DSA.Step1LearnTheBasics.step2JavaCollections.A5Map.A7HashTable;

import java.util.Hashtable;

public class HashTableExample {
    public static void main(String[] args) {
        // internal working is the same as HashMap
        Hashtable<Integer,String> map = new Hashtable<>();
        // Synchronized
        // key or value cannot be null
        // all the methods are the same
        // Legacy Class, ConcurrentHashMaps
        // HashTables are slower than the normal HashMaps

        map.put(1,"Alice");
        map.put(2,"Bob");
        map.put(3,"Raj");
        map.put(4,"Jack");
        map.get(3);
        map.remove(2);
//        map.clear();
        System.out.println(map.containsKey(1));
        System.out.println(map);
//        map.put(null,"Ram"); // Throws Exception
//        map.put(4,null); // Throws Exception

        // Thread Test
        Hashtable<Integer,String> map1 = new Hashtable<>(); // Hashtable are Thread Safe

        Thread t1 = new Thread(() -> {
           for(int i=1;i<=1000;i++){
               map1.put(i,"Thread "+i);
           }
        });

        Thread t2 = new Thread(() -> {
            for(int i=1001;i<=2000;i++){
                map1.put(i,"Thread "+i);
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(map1.size()); // Expected Output 2000
    }
}
