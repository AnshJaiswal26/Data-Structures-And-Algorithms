package Java_Concepts.Generics.GenericMethods;

public class GenericMethods {
    public static void main(String[] args){
        Integer[] arr = {1, 2, 3, 4, 5};
        PrintSomething(arr);

        String[] arr1 = {"hello","my","name","is","Ansh"};
        PrintSomething(arr1);

        map(arr,arr1);

        display(3);// in this case second method will run
        display("hello");// in this case first method will run
    }

    // to make method generic we must add 'void' also
    public static <T> void PrintSomething(T[] arr){
        for(T ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }

    public static <K,V> void map(K[] key,V[] val){
        for(int i=0;i<key.length;i++){
            System.out.println("["+key[i]+","+val[i]+"]");
        }
    }

    public static <T> void display(T val){
        System.out.println("Display - "+ val);
    }

    // function overloading
    public static void display(Integer val){
        System.out.println("Display - "+ val);
    }
}
