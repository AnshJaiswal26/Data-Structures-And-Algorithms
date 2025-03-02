package Java_Concepts.Java8CoreConcepts.A3Function;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Example {
    public static void main(String[] args){
        // works for you in optimized way

        // Represents a function that accepts one argument and produces a result.
        // This is a functional interface whose functional method is apply(Object).

        // it does take input and produce output
        // < parameter type, return type >
        Function<Integer,Integer> square = x -> x*x; // with the help of 'Function' we don't need to create a separate method() to calculate results
        System.out.println(square.apply(5));

        Function<Integer,Integer> doubleIt = d -> d*2;
        Function<Integer,Integer> tripleIt = t -> t*3;

        Function<Integer,Integer> res = doubleIt.andThen(tripleIt);

        System.out.println(res.apply(20));

        int res1 = square.andThen(doubleIt).andThen(tripleIt).andThen(doubleIt).apply(3);
        System.out.println(res1);

        Function<Integer,Integer> fact = a -> { for(int i=1;i<=5;i++) a=a*i; return a;};

        System.out.println(fact.apply(2));
        System.out.println(fact.apply(3));
        System.out.println(fact.apply(4));
        // Function made easier to produce results based on conditions
        // we did not need to use if-else statements and methods

        // compose method
        System.out.println(doubleIt.andThen(tripleIt).apply(4)); // andThen() method apply first doubleIt and then tripleIt
        System.out.println(doubleIt.compose(tripleIt).apply(4)); // compose() method apply first tripleIt and then doubleIt

        Function<Integer,Integer> sumItWith3 = x -> x+3;
        System.out.println(sumItWith3.andThen(doubleIt).apply(4)); // 14
        System.out.println(sumItWith3.compose(doubleIt).apply(4)); // 11

        // identity method
        Function<Integer,Integer> identity = Function.identity();
        System.out.println(identity.apply(4));

        // BiFunction
        // Represents a function that accepts two arguments and produces a result. This is the two-arity specialization of Function.
        // This is a functional interface whose functional method is apply(Object, Object).
        BiFunction<String,String,Integer> biFunction = (s1, s2) -> (s1+s2).length();
        System.out.println(biFunction.apply("Java","Script"));

        BiFunction<Integer,Integer,Integer> add = (n1,n2) -> n1+n2;
        System.out.println(add.apply(5,15));

        // UnaryOperator
        // Represents an operation on a single operand that produces a result of the same type as its operand. This is a specialization of Function for the case where the operand and result are of the same type.
        // This is a functional interface whose functional method is apply(Object).
        UnaryOperator<Integer> sq = n -> n*n;
        System.out.println(sq.apply(5));

        // BinaryOperator
        // Represents an operation upon two operands of the same type, producing a result of the same type as the operands. This is a specialization of BiFunction for the case where the operands and the result are all of the same type.
        // This is a functional interface whose functional method is apply(Object, Object).
        BinaryOperator<Integer> sum = (n1, n2) -> n1+n2;
        System.out.println(sum.apply(5,10));
    }
}