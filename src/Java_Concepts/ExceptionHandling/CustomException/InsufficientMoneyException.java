package Java_Concepts.ExceptionHandling.CustomException;

public class InsufficientMoneyException extends Exception{

    InsufficientMoneyException(){
       super("you don't have enough money!");
    }

}
