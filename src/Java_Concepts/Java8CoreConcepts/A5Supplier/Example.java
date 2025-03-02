package Java_Concepts.Java8CoreConcepts.A5Supplier;

import java.util.function.Supplier;

public class Example {
    public static void main(String[] args){
        // Represents a supplier of results.
        // There is no requirement that a new or distinct result be returned each time the supplier is invoked.
        // This is a functional interface whose functional method is get().

        // it does not take input but produce output
        // no input --> <return type>
        Supplier<Integer> supplier = () -> 10;
        System.out.println(supplier.get());

        Supplier<String> supplier1 = () -> "Hello world";
        System.out.println(supplier1.get());
    }
}
