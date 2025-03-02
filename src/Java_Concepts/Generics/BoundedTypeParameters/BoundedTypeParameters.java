package Java_Concepts.Generics.BoundedTpeParameters;

public class BoundedTypeParameters {
    Box1<Integer> box1 = new Box1<>();
    // here there is no error if we use "Integer" because Integer wrapper implements 'Number'

//    Box1<String> box2 = new Box1<>();
      // here String does not extend Number interface so this is called Bounded type parameter
}

// we can only pass that obj parameters whose class extends Number class
class Box1<T extends Number> {
    // <..> b/w this angular brackets we can only use 'extends' word for class and interfaces
    // and class is always written first then interface will be written

    private T val;

    public T getVal() {
        return val;
    }

    public void setVal(T val) {
        this.val = val;
    }
}