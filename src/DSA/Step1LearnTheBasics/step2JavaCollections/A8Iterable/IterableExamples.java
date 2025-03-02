package DSA.Step1LearnTheBasics.step2JavaCollections.A8Iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IterableExamples {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        for(int i : list) {
            System.out.println(i);
        }
        //        |
        //        |
        //      \ | /  Java Compiler convert this for each loop internally into a iterator
        //       \ /
        //        V

        // for each loop is run with the help of iterator
        Iterator<Integer> iterator = list.iterator(); // this works internally, and it allows applying for each loop on every collection
        while(iterator.hasNext()) {  // hasNext() Returns true if the iteration has more elements.
            System.out.println(iterator.next()); // next() Returns the next element in the iteration.
        }

        ArrayList<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        num.add(6);

        // Iterator allows removing of elements in a loop
//        for(int i : num) {
//            if(i%2 == 0){
//                num.remove(i); // in this case, it throws exception, but iterator does not throw exception
//            }
//        }

        // difference b/w CopyOnWriteArray and Iterator
        // CopyOnWriteArray perform removal of elements on the copy of the original list and after the loop ends,then it shows that result
        // but Iterator can perform remove() inside the running loop

        Iterator<Integer> it = num.iterator();
        while(it.hasNext()) {
            int i = it.next();
            if(i%2 == 0){
                it.remove();
            }
        }
        System.out.println(num);

        // ListIterator
        // It is used for to perform different and more methods than Iterator
        ListIterator<Integer> listIt = num.listIterator();
        listIt.add(10);
        listIt.next();
        listIt.set(20); // we can replace elements in the running loop with the help of ListIterator and perform many methods in the loop
        System.out.println(num);
    }
}
