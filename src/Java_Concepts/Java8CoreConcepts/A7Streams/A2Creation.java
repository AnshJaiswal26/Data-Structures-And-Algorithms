package Java_Concepts.Java8CoreConcepts.A7Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class A2Creation {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1, 2, 4, 3, 5, 6);
        System.out.println(list.stream().filter(x -> x%2 ==0).count());

        // Creating Streams
        // 1. From Collections
        List<String> list1 = Arrays.asList("Abc","Def","Ghi","Jkl");
        Stream<String> stream = list1.stream();

        // 2. From Arrays
        int[] arr = {1,2,3,4,5};
        IntStream stream1 = Arrays.stream(arr);

        // 3. Using Stream.of()
        Stream<String> stream2 = Stream.of("Abc","Def","Ghi","Jkl");

        //4. Infinite Stream
        Stream<Integer> generate = Stream.generate(() -> 1);// (infinite)
        Stream<Integer> generate1 = Stream.generate(() -> 1).limit(12);// (with limit)
        // iterate method
        List<Character> collect = Stream.iterate('A', x -> (char) (x+1)).limit(26).collect(Collectors.toList());
        System.out.println(collect);
        // to direct print
        Stream.iterate('Z', x -> (char) (x-1)).limit(26).forEach(System.out::println);
    }
}
