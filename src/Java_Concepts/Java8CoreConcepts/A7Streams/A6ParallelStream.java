package Java_Concepts.Java8CoreConcepts.A7Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class A6ParallelStream {
    public static void main(String[] args){
        // A type of stream that enables parallel processing of elements
        // Allow multiple threads to process parts of the stream simultaneously
        // This can significantly improve performance for large data sets
        // Workload is distributed across multiple threads

        long start = System.currentTimeMillis();
        List<Integer> num = Stream.iterate(1, x -> x+1).limit(20000).toList();
        List<Long> fact = num.stream().map(A6ParallelStream::factorial).toList();
        long end = System.currentTimeMillis();
        System.out.println("Time taken with stream: "+(end-start)+" ms");

        // faster the single stream
        // because here multiple threads are working
        start = System.currentTimeMillis();
        num = Stream.iterate(1, x -> x+1).limit(20000).toList();
        fact = num.parallelStream().map(A6ParallelStream::factorial).toList();
        end = System.currentTimeMillis();
        System.out.println("Time taken with parallel stream: "+(end-start)+" ms");

        // Parallel streams are most effective for CPU-intensive large dataset where tasks are independent
        // They may add overhead for smaller tasks or simple tasks

        // parallel stream overhead example

        List<Integer> list = new ArrayList<>();
        for(int i=0;i<2000000;i++){
            list.add(1+i);
        }

          // we cannot use primitive data type or any other type except atomic integer. (atomic integer is thread safe)
//        int sum = 0;
//        list.stream().map(num1 -> {
//            sum += num1;
//            return sum;
//        }).toList();

        AtomicInteger sum = new AtomicInteger(0);
        start = System.currentTimeMillis();
        List<Integer> cumulativeSum = list.stream().map(sum::addAndGet).toList();
        //System.out.println("correct result with stream: "+cumulativeSum);
        end = System.currentTimeMillis();
        System.out.println("Time taken with stream: "+(end-start)+" ms");

        sum = new AtomicInteger(0);
        start = System.currentTimeMillis();
        List<Integer> cumulativeSum2 = list.parallelStream().sequential().map(sum::addAndGet).toList();
        //System.out.println("wrong result with parallel stream: "+cumulativeSum2);
        end = System.currentTimeMillis();
        System.out.println("Time taken with parallel stream: "+(end-start)+" ms");

        //  And here the parallel stream fails for dependent tasks.

        // To achieve a proper result with parallel stream on dependent data or task, we will use sequential() operation
        // sequential() --> Returns an equivalent stream that is sequential. It May return itself, either because the stream was already sequential, or because the underlying stream state was modified to be sequential.
        //                  This is an intermediate operation.
        //                  Returns: a sequential stream
        // but it does not provide better performance

    }

    public static long factorial(Integer n){
        long res = 1;
        for(int i=2;i<=n;i++){
            res *= i;
        }
        return res;
    }
}
