package Java_Concepts.Java8CoreConcepts.A8Collectors;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsExamples {
    public static void main(String[] args) {
        // Collectors is a utility class
        // provide a set of methods to create common collectors

        // Collecting to a List
        List<String> list = Arrays.asList("Alice", "Bob", "Charlie");
        List<String> res = list.stream()
                .filter(s -> s.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(res);

        // Collecting to a Set
        List<Integer> list1 = Arrays.asList(1, 2, 2, 3, 3, 4, 4, 5);
        Set<Integer> collect = list1.stream().collect(Collectors.toSet());
        System.out.println(collect);

        // Collecting to a specific collection
        list1.stream().collect(Collectors.toCollection(Stack::new));// we can convert to any collection
                                                 // Or () -> new Stack<>()

        // Joining Strings
        // Concatenates stream elements into a single string
        String Concatenates = list.stream().collect(Collectors.joining(", "));
        System.out.println(Concatenates);

        // Summarizing Data
        // Generate statistical Summary (Count, Min, Max, Avg, Sum)
        IntSummaryStatistics stats = list1.stream().collect(Collectors.summarizingInt(x -> x));
        System.out.println("Count: "+stats.getCount());
        System.out.println("Min: "+stats.getMin());
        System.out.println("Max: "+stats.getMax());
        System.out.println("Avg: "+stats.getAverage());
        System.out.println("Sum: "+stats.getSum());

        // Direct calculating (Count, Min, Max, Avg, Sum)
        Double collect1 = list1.stream().collect(Collectors.averagingInt(x -> x));
        Integer collect2 = list1.stream().collect(Collectors.summingInt(x -> x));
        Long collect3 = list1.stream().collect(Collectors.counting());
        Optional<Integer> collect4 = list1.stream().collect(Collectors.maxBy(Comparator.naturalOrder()));
        Optional<Integer> collect5 = list1.stream().collect(Collectors.minBy(Comparator.naturalOrder()));
        System.out.println("Averaging: "+collect1);
        System.out.println("Sum: "+collect2);
        System.out.println("Count: "+collect3);
        System.out.println("Max: "+collect4.get());
        System.out.println("Min: "+collect5.get());

        // Grouping Elements
        List<String> list2 = Arrays.asList("Hello", "World", "Alia", "Bob", "Charlie");
        Map<Integer, List<String>> collect6 = list2.stream().collect(Collectors.groupingBy(String::length)); // Converting elements into a map based on conditions
        System.out.println(collect6);
        Map<Integer, String> collect7 = list2.stream().collect(Collectors.groupingBy(String::length, Collectors.joining(", "))); // we can also join elements from a list
        System.out.println(collect7);
        Map<Integer, Long> collect8 = list2.stream().collect(Collectors.groupingBy(String::length, Collectors.counting())); // we can also count elements based on length or given condition
        System.out.println(collect8);
        TreeMap<Integer, String> collect9 = list2.stream().collect(Collectors.groupingBy(String::length, () -> new TreeMap<>(Comparator.reverseOrder()), Collectors.joining(", ")));// we can also create a specific type of map with Comparator
        System.out.println(collect9);

        // Partitioning Elements
        // Partitions elements into two groups(true & false) based on given predicate
        Map<Boolean, List<String>> collect10 = list2.stream().collect(Collectors.partitioningBy(s -> s.length() > 4));
        System.out.println(collect10);

        // Mapping and Collecting
        // it is another way to modify stream without providing intermediate operation
        List<String> collect11 = list2.stream().collect(Collectors.mapping(String::toUpperCase, Collectors.toList()));
        System.out.println(collect11);

        // toMap
        List<String> listd = Arrays.asList("Hello", "World", "Alia", "Bob", "Charlie");
        Map<String, Integer> collect13 = listd.stream()
                .collect(Collectors.toMap(String::toUpperCase,String::length));
        System.out.println(collect13);

        // Example1 Collecting names by length
        List<String> l1 = Arrays.asList("Akshita","Siya","Divyanshi","Sneha");
        System.out.println(l1.stream().collect(Collectors.groupingBy(String::length)));

        // Example2 Counting word occurrences
        String s = "hello world hello java world";
        System.out.println(Arrays.stream(s.split(" ")).collect(Collectors.groupingBy(x->x,Collectors.counting())));

        // Example3 Partitioning Even and Odd Numbers
        List<Integer> l2 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println(l2.stream().collect(Collectors.partitioningBy( x -> x%2 ==0)));

        // Example4 Summing values in a map
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 4);
        System.out.println(map.values().stream().reduce(Integer::sum).get());
        System.out.println(map.values().stream().mapToInt(x -> x).sum());
        System.out.println(map.values().stream().collect(Collectors.summingInt(x -> x)));

        // Example5 Creating a map from stream Elements
        List<String> list3 = Arrays.asList("Hello", "World", "Alia", "Bob", "Charlie");
        Map<String, Integer> collect12 = list3.stream()
                .collect(Collectors.toMap(String::toUpperCase,String::length));
        System.out.println(collect12);

        // Example6 Counting word occurrences using toMap
        List<String> list4 = Arrays.asList("Hello", "World", "Alia", "Hello", "World");
        System.out.println(list4.stream().collect(Collectors.toMap(String::toUpperCase,x -> 1, Integer::sum))); // we can also write Integer::sum to (x,y) -> x+y
    }
}
