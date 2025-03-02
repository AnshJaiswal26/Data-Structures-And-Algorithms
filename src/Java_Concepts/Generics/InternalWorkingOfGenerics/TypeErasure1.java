package Java_Concepts.Generics.InternalWorkingOfGenerics;

public class TypeErasure1 {
    public static void main(String[] args){
        Box<Integer> box = new Box<>();
        box.setVal(5);
        Integer i = box.getVal();

          // internally
//        Box box = new Box();
//        box.setVal(5);
//        Integer i = (Integer) box.getVal();
        // compiler typeCast objects after declaration
    }
}
// At RunTime compiler erase Types (Generic)
// Types cannot be converted into byte code
class Box<T>{
    private T val;

    public void setVal(T val) {
        this.val = val;
    }

    public T getVal() {
        return val;
    }
}
// Internal working of Java_Concepts.Java_Concepts.Generics
// it converts 'T' into Object After Declaration of Type
// class Box{
//     private Object val;
//
//     public void setVal(Object val) {
//         this.val = val;
//     }
//
//     public Object getVal() {
//         return val;
//     }
// }