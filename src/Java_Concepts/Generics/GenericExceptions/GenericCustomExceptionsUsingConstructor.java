package Java_Concepts.Generics.GenericExceptions;

public class GenericCustomExceptionsUsingConstructor {
    public static void main(String[] args){
        try {
            throw new MyException(123);
        }catch (MyException e){
            System.out.println("Caught exception: "+e);
        }

        try {
            throw new MyException("hjh");
        }catch (MyException e){
            System.out.println("Caught exception: "+e);
        }
    }
}
// Since we can not create custom Exceptions for Java_Concepts.Generics we will use Constructor
// because Java_Concepts.Generics removed by compiler at RunTime
// Or we can create exceptions to every Objects

class MyException extends Exception{
    public <T> MyException(T val){
        super("Exception related to value: "+ val.toString()+" of type: "+val.getClass().getName());
    }
}