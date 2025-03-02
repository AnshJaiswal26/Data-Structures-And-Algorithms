package Java_Concepts.Java8CoreConcepts.A7Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class A5LazyEvaluation {
    public static void main(String[] args){
        List<String> names = Arrays.asList("siya","nash","rahul","avinash","avi","ash");
        Stream<String> stream = names.stream().filter(name -> {
           System.out.println("filtering - "+name);
           return name.length()>3;
        });

        System.out.println("Before terminal operation");
        List<String> result = stream.toList();

        System.out.println("After terminal operation");
        System.out.println(result);
    }
}
