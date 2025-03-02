package DSA.Step1LearnTheBasics.step2JavaCollections.A5Map.A10IdentityHashMap;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapExample {
    public static void main(String[] args){
        // In an IdentityHashMap, two keys k1 and k2 are considered equal if and only if (k1==k2).
        // (In normal Map implementations (like HashMap) two keys k1 and k2 are considered equal if and only if (k1==null ? k2==null : k1.equals(k2)).)
        // In normal HashMaps we can customize hashCode() and equals() methods and that methods will consider at runtime
        // but in IdentityHashMaps it always use Object class hashCode() method and == operator to generate hashCodes and to compare keys
        IdentityHashMap<String,Integer> identityHashMap = new IdentityHashMap<>();
        HashMap<String,Integer> normalHashMap = new HashMap<>();

        // String class has its own hashCode() method (Override's Object class hashCode() method)
        // it generates hashCodes based on Contents ('Key' is content) so it returns same hashCode for key1 and key2
        String key1 = new String("Key");
        String key2 = new String("Key");

        // so if we put key1 and key2 in map so according to String class hashCode() method and equals() method
        // key1 should replace with key2 because String class methods check contents if contents are same then it replace the keys
        // but according to the IdentityHashMaps keys will not replace by map because new objects have always unique memory address
        // IdentityHashMaps always check memory address if they are equal then the keys will be replaced
        identityHashMap.put(key1,1);
        identityHashMap.put(key2,2);

        normalHashMap.put(key1,1);
        normalHashMap.put(key2,2);

        System.out.println("IdentityHashMap -"+identityHashMap);
        System.out.println("NormalHashMap -"+normalHashMap);


    }
}
