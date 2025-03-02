package Java_Concepts.Generics.GenericsClass;

public class GenericsBox {
    public static void main(String[] args){
        Box<Integer> box = new Box<>();
        box.setValue(2);
        int i = box.getValue();
        System.out.println(i);
    }
}

class Box<T>{
    // Box is now type safe
    private T val;

    public T getValue(){
        return val;
    }

    public void setValue(T val){
        this.val = val;
    }
}