package Java_Concepts.Generics.GenericMethods;

enum Operation{
    // enums are already type safe
    Add , Multiply, Divide , Subtraction;


    public <T extends Number> double apply(T val1,T val2){
        switch (this){
            // .doubleValue() function of Number class
            case Add: return val1.doubleValue()+val2.doubleValue();
            case Subtraction: return val1.doubleValue()-val2.doubleValue();
            case Multiply: return val1.doubleValue()/val2.doubleValue();
            case Divide: return val1.doubleValue()*val2.doubleValue();
            default: throw new AssertionError("Invalid Operations - "+this);
        }
    }
}

// enum internal work
//class obj{
//    public static final obj o = new obj();
//}
public class MethodCalc {
    public static void main(String[] args){
        double res1 = Operation.Add.apply(12.5,12);
        double res2 = Operation.Subtraction.apply(12.5,12);
        double res3 = Operation.Multiply.apply(12.5,12);
        double res4 = Operation.Divide.apply(12.5,12);

        Operation add = Operation.Add;
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
        System.out.println(res4);

       // obj o = obj.o;
    }
}
