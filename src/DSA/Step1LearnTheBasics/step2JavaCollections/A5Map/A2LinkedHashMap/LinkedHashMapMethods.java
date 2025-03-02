package DSA.Step1LearnTheBasics.step2JavaCollections.A5Map.A2LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapMethods {
    public static void main(String[] args){
        // LinkedHashMaps are created using doubly Linked List they use the concept of LRU Cache
        // created with default capacity 16 , Load Factor- 0.75 (16 x 0.75) 12, access order - false, Linked List to tree (if bucket size 8 exceeds)
        // And LinkedHashMaps are ordered HashMaps
        LinkedHashMap<Integer,String> mpp = new LinkedHashMap<>();

        // we can also create custom default capacity, Load Factor, access order - false (by default), Linked List to tree (if bucket size 8 exceeds)
        // access order -  if true it enables the LFU Cache concept else disable if false
        LinkedHashMap<Integer,String> mppDemo = new LinkedHashMap<>(12,0.5f,true);
        mppDemo.put(2,"Bob");
        mppDemo.put(3,"Grey");
        mppDemo.put(4,"Jack");
        mppDemo.put(5,"Paul");
        mppDemo.get(4);
        System.out.println(mppDemo);

        // Adding key value pairs in mpp using put(K,V) method
        // key(Integer type) values represents Roll no. and Values(String type) represents name
        mpp.put(1,"Alice");
        mpp.put(2,"Bob");
        mpp.put(3,"Grey");
        mpp.put(4,"Jack");
        mpp.put(5,"Paul");
        System.out.println(mpp.get(2));

        // if we put a pair with already existing key
        // it replace that key-value pair with new pair
        mpp.put(2,"Ben"); // now it replace the value of key '2' with Ben
        System.out.println(mpp.get(2));

        // get names using get(K) method which return values
        System.out.println(mpp.get(3));
        System.out.println(mpp.get(4));
        System.out.println(mpp.get(5));
        System.out.println(mpp.get(2));
        System.out.println(mpp.get(1));

        // to get size
        System.out.println(mpp.size());

        // getOrDefault() Method it returns value of key if present else return default given value
        System.out.println(mpp.getOrDefault(4,"null")); // in this case it returns Jack because key is present
        System.out.println(mpp.getOrDefault(8,"null")); // in this case it returns null because key is not present

        // it checks if the key is absent or not exists in map it put it into map
        mpp.putIfAbsent(2,"Ram");
        mpp.putIfAbsent(7,"Shyam");

        LinkedHashMap<Integer,String> mpp2 = new LinkedHashMap<>();
        mpp.putAll(mpp2); // put all the pairs from one map to another

        // containsKey() method to check Key is present or not
        // if present it returns true else false
        System.out.println(mpp.containsKey(4));
        System.out.println(mpp.containsKey(7));

        // containsValue() method to check Key is present or not
        // if present it returns true else false
        System.out.println(mpp.containsValue("Alice"));
        System.out.println(mpp.containsValue("Rock"));

        // isEmpty() is returns true if map is empty else false
        System.out.println(mpp.isEmpty());

        //Printing Map directly because it Overrides toString() Method
        System.out.println(mpp);

        //Printing Map keys using for each loop using set
        Set<Integer> keys = mpp.keySet();
        for(Integer key : keys){
            System.out.println(key);
        }

        //Printing Map Values using for each loop values() method
        for(String value : mpp.values()){
            System.out.println(value);
        }

        //Printing Map Entries using for each loop using set
        Set<Map.Entry<Integer,String>> entries = mpp.entrySet();
        for(Map.Entry<Integer,String> entry : entries){
            System.out.println("["+entry.getKey()+" ,"+entry.getValue()+"]");
        }

        //Printing Map Entries and modifying using for each loop using set
        Set<Map.Entry<Integer,String>> entries1 = mpp.entrySet();
        for(Map.Entry<Integer,String> entry : entries){
            entry.setValue(entry.getValue().toUpperCase());
            System.out.println("["+entry.getKey()+" ,"+entry.getValue()+"]");
        }
    }
}
