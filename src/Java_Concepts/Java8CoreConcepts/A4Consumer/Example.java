package Java_Concepts.Java8CoreConcepts.A4Consumer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Example {
    public static void main(String[] args){
        // Represents an operation that accepts a single input argument and returns no result.
        // Unlike most other functional interfaces, Consumer is expected to operate via side-effects.

        // it does take input, but produces no output
        // <parameter type> --> no output
        Consumer<Integer> consumer = x -> System.out.println(x);
        consumer.accept(10);

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        Consumer<List<Integer>> consumer1 = x ->{ for(int i: x) System.out.print(i+" ");};
        consumer1.accept(list);
        System.out.println();
        // Or
        List<Integer> list1 = Arrays.asList(1,2,3,4);
        Consumer<List<Integer>> printListAdd1 = l -> { for(int i: l) System.out.print(i+1+" "); };
        printListAdd1.accept(list1);
        System.out.println();

        consumer1.andThen(printListAdd1).accept(list);

        // BiConsumer
        // Represents an operation that accepts two input arguments and returns no result. This is the two-arity specialization of Consumer. Unlike most other functional interfaces, BiConsumer is expected to operate via side-effects.
        // This is a functional interface whose functional method is accept(Object, Object).
        BiConsumer<Integer,Integer> biConsumer = (n1,n2) -> {
            System.out.println(">" + n1 + " " + n2 + "<");
        };
        biConsumer.accept(10,20);

    }
}
