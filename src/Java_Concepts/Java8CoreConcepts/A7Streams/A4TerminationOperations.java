package Java_Concepts.Java8CoreConcepts.A7Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class A4TerminationOperations {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

        // 1.collect --> Performs a mutable reduction operation on the elements of this stream using a Collector. A Collector encapsulates the functions used as arguments to collect(Supplier, BiConsumer, BiConsumer), allowing for reuse of collection strategies and composition of collect operations such as multiple-level grouping or partitioning.
        list.stream().skip(3).collect(Collectors.toList()); // in old version
        list.stream().skip(3).toList();                     // in new version

        // 2.forEach --> use with stream, or we can also use it directly on collections
        list.stream().skip(2).forEach(System.out::println);

        // 3. reduce: combines elements to produce a single result
        Optional<Integer> reduce = list.stream().reduce(Integer::sum);// here we can also use Math::addExact instead of lambda expression (x,y) -> x+y
        System.out.println(reduce.get());                               // Or Integer::sum

        // 4. count -->
        System.out.println(list.stream().filter(x -> x%2 == 0).count());

        // 5. anyMatch, allMatch, noneMatch
        boolean b = list.stream().anyMatch(x -> x % 2 == 0);
        System.out.println(b);
        boolean b1 = list.stream().allMatch(x -> x > 0);
        System.out.println(b1);
        boolean b2 = list.stream().noneMatch(x -> x > 10);
        System.out.println(b2);

        // 6. findFirst, findAny
        Optional<Integer> first = list.stream().findFirst();
        System.out.println(first.get());
        Optional<Integer> any = list.stream().findAny();
        System.out.println(any.get());

        // 7. toArray()
        Stream<Integer> integerStream = list.stream().filter(x -> x % 2 == 0);
        Object[] arr = integerStream.toArray();

        // 8. min/max
        Optional<Integer> max = list.stream().max(Comparator.naturalOrder()); // max() Returns the maximum element of this stream according to the provided Comparator. This is a special case of a reduction.
        Optional<Integer> min = list.stream().min(Comparator.naturalOrder()); // min() Returns the minimum element of this stream according to the provided Comparator. This is a special case of a reduction.
        System.out.println("max: "+max.get()+" , "+"min: "+min.get());

        // Example1: filtering and collecting names
        List<String> list2 = Arrays.asList("Avi","Danish","Gautam","Jack");
        System.out.println(list2.stream().filter(x -> x.length()>4).toList());

        // Example2: Squaring and sorting
        System.out.println(list.stream().map(x -> x*x).sorted().toList());

        // Example3: summing all
        System.out.println(list.stream().reduce(Integer::sum).get());

        // Example4: Counting Occurrence of character
        String str = "carrace";
        System.out.println(str.chars().filter(x -> x=='a').count());

        // Example5
        List<Integer> list3 = Arrays.asList(1, 2, 344, 5, 6);
        Stream<Integer> stream = list3.stream();
        stream.forEach(System.out::println); // here for is terminal operation

        // stream cannot be reused after a terminal operation has been called
//        List<Integer> list1 = stream.map(x -> x - 1).toList(); // throws an exception

        // Stateful & Stateless
        // Stateless operations - those operations which depend on a single element to complete their operations (map, filter, reduce)
        // stateful operations - those operations which depends on multiple elements to complete their operations (distinct, sorted)

        // forEachOrdered
        List<Integer> list4 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Using forEach in parallel stream");
        list4.parallelStream().forEach(System.out::println);
        // here forEach print all elements of parallel stream in an unordered manner, because parallel streams does not define order
        // so we can use forEachOrdered to order elements in parallel stream
        System.out.println("Using forEachOrdered in parallel stream");
        list4.stream().forEachOrdered(System.out::println);
    }
}