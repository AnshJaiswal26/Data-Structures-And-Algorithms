package Java_Concepts.Java8CoreConcepts.A6CombinationExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args){
        Predicate<Integer> predicate = x -> x%2 == 0;
        Function<Integer,Integer> function = x -> x*x;
        Consumer<Integer> consumer = x -> System.out.println(x);
        Supplier<Integer> supplier = () -> 6;

        if(predicate.test(supplier.get())){
            consumer.accept(function.apply(supplier.get()));
        }

        // Method Reference
        List<Integer> list = Arrays.asList(2, 3, 1, 4, 2, 4);
        list.forEach(System.out::println); // :: -> Represents an operation that accepts a single input argument and returns no result. Unlike most other functional interfaces, Consumer is expected to operate via side-effects.
                                          // here we call method without invoking it
        list.forEach(x -> System.out.print(x+" "));

        List<List<Integer>> list1 = new ArrayList();
        list1.add(Arrays.asList(1, 2, 3, 4, 5));
        list1.add(Arrays.asList(6, 7, 8, 9, 10));
        list1.add(Arrays.asList(11, 12, 13, 14, 15));

        list1.forEach(x -> x.forEach(System.out::println));

        Consumer<Integer> c = System.out::println;
        BiFunction<perform,String,String> f = perform::doubleIt;
        String s = f.apply(new perform(),"Ansh ")+"Jaiswal";
        System.out.println(s);

        // Constructor Reference
        List<String> list2 = Arrays.asList("A", "B", "C");
        List<Letters> list3 = list2.stream().map(Letters::new).collect(Collectors.toList());

    }
}
class Letters{
    private String name;

    Letters(String s){
        this.name = s;
    }
}
class perform{

    public <T,V> V doubleIt(T a){
        return (V) a;
    }
}