package Java_Concepts.Generics.BoundedTpeParameters;

interface Printable{
    void print();
}

class MyNumbers extends Number implements Printable {

    private final int value;

    MyNumbers(int value){
        this.value = value;
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

    @Override
    public void print() {

    }
}

// class should be written first because class does not have multiple inheritance
class boxx<T extends Number & Printable>{

}

public class MultipleBoundedTypeParameters {
    public static void main (String[] args){
        boxx<MyNumbers> box = new boxx<>(); // multiple bounded parameter
    }
}






