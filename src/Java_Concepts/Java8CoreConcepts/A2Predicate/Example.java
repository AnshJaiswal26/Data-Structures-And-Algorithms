package Java_Concepts.Java8CoreConcepts.A2Predicate;

import java.util.function.*;

public class Example {
    public static void main(String[] args){
        // Predicate --> Functional Interface (Boolean valued function)

        // Represents a predicate (boolean-valued function) of one argument.
        // This is a functional interface whose functional method is test(Object).

        // it does take input and produces output in boolean type
        // <parameter type> --> produces output in boolean type (true/false)
        Predicate<Integer> isEven = x -> x%2 == 0; // better than if-else for one argument
        Predicate<Integer> isOdd  = x -> x%2 != 0; // better than if-else for one argument
        System.out.println(isEven.test(10));
        System.out.println(isOdd.test(7));

        Predicate<String> isStartWithA =  s -> s.toUpperCase().startsWith("A");
        Predicate<String> isStartWithJ =  s -> s.toUpperCase().startsWith("J");

        System.out.println(isStartWithA.test("Ant"));
        System.out.println(isStartWithA.test("banana"));

        System.out.println(isStartWithA.and(isStartWithJ).test("Apple")); // isStartWithA --> A && J --> false
        System.out.println(isStartWithA.or(isStartWithJ).test("Apple"));  // isStartWithA --> A || J --> true

        System.out.println(isStartWithA.test("Apple") && (isStartWithJ.test("Lava")));

        // BiPredicate
        BiPredicate<Integer,Integer> isSumEven = (n1,n2) -> (n1+n2)%2 == 0;
        System.out.println(isSumEven.test(5,10));
    }
}
