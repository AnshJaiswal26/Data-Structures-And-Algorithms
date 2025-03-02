package Java_Concepts.Generics.GenericConstructor;

class Box2 {
    // we can create generic constructors like this
    public <T> Box2(T value){
         T val = value;
    }

    public <K extends Number,V extends Number> Box2(K key,V val ){
        V value = val;
        K Key = key;
    }

}
public class GenericConstructor {
    public static void main(String[] args){
        Box2 box = new Box2(3);
        Box2 box1 = new Box2("Hello");
        Box2 box2 = new Box2(7,5); // Integer extends Number class
    }
}
