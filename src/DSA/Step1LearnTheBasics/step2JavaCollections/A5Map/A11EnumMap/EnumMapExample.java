package DSA.Step1LearnTheBasics.step2JavaCollections.A5Map.A11EnumMap;

import java.util.EnumMap;

public class EnumMapExample {
    public static void main(String[] args) {
        // all the methods are the same as the normal HashMaps
        EnumMap<Day, String> map = new EnumMap<>(Day.class); // enter class_name.class in its constructor
        // No Hashing (no hashCodes)
        // it stores data based on index/ordinal
        // Example - [_,"walks","swimming",_,_,_,_] has the same size of an array as enum array
        // it has an internal array to store enums in order
        // memory efficient
        // faster than HashMaps
        map.put(Day.TUESDAY,"walks");
        map.put(Day.WEDNESDAY,"swimming");
    }
}
enum Day{
    MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;
}