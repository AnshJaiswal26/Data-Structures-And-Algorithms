package Java_Concepts.WrapperClasses;
import java.util.ArrayList;

public class WrapperClasses {
    public static void main(String[] args){
        int a = 19;
        // here 'int' is a primitive data type
        // and 'a' is a variable
        // primitive data types are stored in stack

        Integer b = 56;
        // here 'Integer' is a class
        // and 'b' is a reference variable
        // reference variables or objects are stored in heap

        // similarly there are many classes like
        Character c = 'v';
        Boolean d = true;
        Long e = 1223l;
        Short f = 34;
        Double g = 5.5;
        Float h = 1.2f;
        Byte i = 1;

        // why we need Java_Concepts.Java_Concepts.WrapperClasses
        // because in java there is use of wrapper classes in java collections
        // where we can not use primitive data types
        // example
        ArrayList<Integer> list = new ArrayList<>();
        // here ArrayList is a class which stored Wrapper class objects
        // we can not use primitive data types here

        Integer k = null; // here Wrapper classes can be intialized as null
        int l = 0;        // but primitive data types can not be null


        // AutoBoxing and AutoUnboxing
        Integer z = Integer.valueOf(1);
        // boxing - converting primitive data type to reference variable
        // this is called boxing but java does it by default
        // so this is called AutoBoxing
        // it automatically converts from primitive to object

        int x = z.intValue();
        // Unboxing - converting reference variable to primitive data type
        // this called Unboxing but java does it by default
        // so this called AutoUnboxing
        // it automatically converts from object to primitive


        // methods in Wrapper Classes
        Integer.max(3,4);
        String str = "234";
        Integer.valueOf(str); // converts to Integer
        Integer.min(3,4);
        // and many more
        // similar for all Wrapper classes
    }
}
