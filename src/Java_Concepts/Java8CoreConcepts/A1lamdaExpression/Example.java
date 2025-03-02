package Java_Concepts.Java8CoreConcepts.A1lamdaExpression;

public class Example {
    public static void main(String[] args){
        // Lambda expression can be written only for the functional interfaces.
        // functional interfaces - those interfaces which contain only one public abstract method and no any other methods except default methods

        // we can create our own function interface and perform lambda expressions on it
        OperationInterface sum = (a,b) -> a+b;
        OperationInterface Subtract = (a,b) -> a-b;
        OperationInterface Multiplication = (a,b) -> a*b;
        OperationInterface divide = (a,b) -> a/b;

        System.out.println(sum.operate(10,20));
        System.out.println(Subtract.operate(27,20));
        System.out.println(Multiplication.operate(10,20));
        System.out.println(divide.operate(100,20));

        MultipleOperationInterface sumOf3 = (a,b,c) -> a*b*c;
    }
}
// here we have to make many classes for many operations, but we can use lambda expression instead of making classes
class sum implements OperationInterface{
    @Override
    public int operate(int a,int b){
        // sum
        return a+b;
    }
}

interface OperationInterface{
    int operate(int a,int b);
}

interface MultipleOperationInterface{
    int operate(int a,int b,int c);
}