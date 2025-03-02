package Java_Concepts.Java8CoreConcepts.A7Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class A3IntermediateOperations {
    public static void main(String[] args){
        // Intermediate Operations transform a Stream into another Stream
        // they don't execute util a terminal operation is invoked

        // 1. filter --> Returns a stream consisting of the elements of this stream that match the given predicate.
        List<String> list = Arrays.asList("Abc","Def","ahi","Jkl");
        Stream<String> stream = list.stream().filter(x -> x.toUpperCase().startsWith("A"));
        // no filtering at this point
        // to filter use terminal operation
        System.out.println(stream.count());

        // example of method reference
        Function<jj,String> z = x -> x.getName();
        System.out.println(z.apply(new jj()));

        // map --> Returns a stream consisting of the results of applying the given function to the elements of this stream.
        list = list.stream().map(x -> x.toUpperCase()).toList();
        System.out.println(list);

        // sorted --> Returns a stream consisting of the elements of this stream, sorted according to the provided Comparator.
        list = list.stream().sorted().toList();
        System.out.println(list);
        list = list.stream().sorted((a,b) -> b.compareTo(a)).toList(); // with custom comparator
        System.out.println(list);

        // distinct --> Returns a stream consisting of the distinct elements (according to Object. equals(Object)) of this stream.
        List<Integer> list1 = Arrays.asList(1,2,3,4,5,5,4,3,2,1);
        System.out.println(list1.stream().distinct().count());

        // limit --> Returns a stream consisting of the elements of this stream, truncated to be no longer than maxSize in length.
        System.out.println(Stream.iterate(1,x -> x+1).limit(100).count());

        // skip
        System.out.println(Stream.iterate(1,x -> x+1).skip(10).limit(100).count());

        // peek
        // Performs an action on each element as it is consumed
        // forEach() (termination operation) is used to end the process, but peek() is an intermediate operation
        Stream.iterate(1,x -> x+1).limit(100).peek(System.out::println).count();

        // flatmap
        // handle streams of collections, lists, or arrays where each element is itself a collection
        // Flatten nested structures (e.g., lists within lists) so that they can be processed as a single sequence of elements
        // Transform and flatten elements at the same time.
        List<List<String>> listoflists = Arrays.asList(
                Arrays.asList("Abhishek","Jack"),
                Arrays.asList("Avi","Ash"),
                Arrays.asList("Bob","Alice")
        );
        List<String> list2 = listoflists.stream().flatMap(List::stream).map(String::toUpperCase).toList();
        System.out.println(list2);

        List<String> stringList = Arrays.asList(
                "Hello World",
                "Hii My name is Alice",
                "Hey Jack"
        );
        List<String> list3 = stringList.stream()
                .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
                .map(String::toUpperCase)
                .toList();
        System.out.println(list3);
    }
}
class jj{
    private static String name = "Nash";

    public String getName(){
        return name;
    }
}