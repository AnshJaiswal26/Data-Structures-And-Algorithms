package DSA.Step1LearnTheBasics.step2JavaCollections.A5Map.A1HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapMethods {
    public static void main(String[] args){
        // created with default capacity 16 , Load Factor- 0.75 (16 x 0.75) 12, Linked List to tree (if bucket size 8 exceeds)
        // And HashMaps are unordered
        HashMap<Integer,String> mpp = new HashMap<>();

        // we can also create custom default capacity, Load Factor, Linked List to tree (if bucket size 8 exceeds)
        HashMap<Integer,String> mppDemo = new HashMap<>(12,0.5f);

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

        HashMap<Integer,String> mpp2 = new HashMap<>();
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

//        +---------------------+-------------------------+-------------------------+----------------------------------------------------------------------------------------------------+
//        | Operation           |       Average-Case      |      Worst-Case         | Explanation                                                                                        |
//        |                     |     Time Complexity     |   Time Complexity       |                                                                                                    |
//        +---------------------+-------------------------+-------------------------+----------------------------------------------------------------------------------------------------+
//        | put(key, value)     | O(1)                    | O(log n)                | Inserts a key-value pair. Average: Constant time due to direct bucket access.                      |
//        |                     |                         |                         | Worst-Case: O(log n) when bucket converts to a Red-Black Tree after exceeding collision threshold. |
//        +---------------------+-------------------------+-------------------------+----------------------------------------------------------------------------------------------------+
//        | get(key)            | O(1)                    | O(log n)                | Retrieves the value associated with a key. Average: Constant time via direct bucket access.        |
//        |                     |                         |                         | Worst-Case: O(log n) when searching within a treeified bucket.                                     |
//        +---------------------+-------------------------+-------------------------+----------------------------------------------------------------------------------------------------+
//        | remove(key)         | O(1)                    | O(log n)                | Removes the key-value pair associated with a key. Average: Constant time with direct access.       |
//        |                     |                         |                         | Worst-Case: O(log n) when removing from a treeified bucket.                                        |
//        +---------------------+-------------------------+-------------------------+----------------------------------------------------------------------------------------------------+
//        | containsKey(key)    | O(1)                    | O(log n)                | Checks if a key exists in the map. Average: Constant time via direct bucket access.                |
//        |                     |                         |                         | Worst-Case: O(log n) when searching within a treeified bucket.                                     |
//        +---------------------+-------------------------+-------------------------+----------------------------------------------------------------------------------------------------+
//        | containsValue(value)| O(n)                    | O(n)                    | Checks if a value exists in the map. Both average and worst-case are linear time since it may      |
//        |                     |                         |                         | need to traverse all entries.                                                                      |
//        +---------------------+-------------------------+-------------------------+----------------------------------------------------------------------------------------------------+
//        | size()              | O(1)                    | O(1)                    | Returns the number of key-value pairs. Both average and worst-case are constant time as the size   |
//        |                     |                         |                         | is maintained as a separate field.                                                                 |
//        +---------------------+-------------------------+-------------------------+----------------------------------------------------------------------------------------------------+
