package Java_Concepts.ExceptionHandling.Checked;

import java.io.FileNotFoundException;

public class ThrowsAndThrow {
    static void methodn(){
        throw new ArithmeticException("oops!");
        // its does not show any error because it is runtime exception
        // And we do not need to mention "throws exception"
    }
    public static void main(String args[]) throws Exception{
       // method1();
        methodn();
    }

    // "throws" handles the compile time error
    // but gives an exception at run time
    static void method3() throws FileNotFoundException{

        // using "throw" key word for creating exception
        // means force fully throws exception
        // "FileNotFoundException" is checked exception
        // that is why we need to write "throws Exception" outside of method
        throw new FileNotFoundException("oops!");// "oops!" is to print message with exception


        // using try catch to catch exception
//        try{
//            FileReader fileReader = new FileReader("a.txt");
//        }catch(Exception e){
//            System.out.println("FILE NOT FOUND!");
//        }

    }
    static void method2() throws Exception{
        method3();
    }
    static void method1() throws Exception{
        method2();
    }
}
