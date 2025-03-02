package Java_Concepts.Generics.InternalWorkingOfGenerics;

public class TypeErasure2 {
}
class NumberBox<T> extends Number{
    private T val;

    public T getVal() {
        return val;
    }

    public void setVal(T val) {
        this.val = val;
    }

    @Override
    public int intValue() {
        return 0;
    }

    @Override
    public long longValue() {
        return 0;
    }

    @Override
    public float floatValue() {
        return 0;
    }

    @Override
    public double doubleValue() {
        return 0;
    }
}

// internally all the Types becomes Number class Object because NumberBox extends Number Class
// NumberBox{
//    private Number val;
//
//    public Number getVal() {
//        return val;
//    }
//
//    public void setVal(Number val) {
//        this.val = val;
//    }
//
//    @Override
//    public int intValue() {
//        return 0;
//    }
//
//    @Override
//    public long longValue() {
//        return 0;
//    }
//
//    @Override
//    public float floatValue() {
//        return 0;
//    }
//
//    @Override
//    public double doubleValue() {
//        return 0;
//    }
//}