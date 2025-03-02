package Java_Concepts.Generics.LowerAndUpperBoundAndUnknownObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Example {
    public static void main(String[] args){
        // <?> used only to read something we cannot modify
        List<?> list = Arrays.asList(1, 2, 34, 4);
        read(list);

        // now we can modify List because we upper bound unknown '?' with parent class
        // now any type of number can be pass as an input in list,but we cannot add elements
        // because we don't know who extends Number class
        List<? extends Number> list1 = Arrays.asList(1, 2.2, 34, 4);
        System.out.println(sum(list1));

        // now we can modify List because we lower bound unknown '?' with  parent class of Integer which is a Number class
        // now any type of number can be pass as an input
        // And we can also add numbers in list
        ArrayList<? super Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(3);
        list2.add(4);
        printNumber(list2);
    }

    public static void read(List<?> list){
        for(Object o : list){
            System.out.print(o+" ");
        }
        System.out.println();
    }

    // this is called upperBound because unknown '?' only can be a Number
    // because wildcard '?' extends Number
    public static double sum(List<? extends Number> list1){
        double sum = 0;
        for(Number n : list1){
            sum+=n.doubleValue();
        }
        return sum;
    }

    // this is called lowerBound because unknown '?' only can be a Number or an Object
    // because Integer extends Number and Object
    public static void printNumber(List<? super Integer> list2){
        for(Object o : list2){
            System.out.print(o+" ");
        }
    }
}
