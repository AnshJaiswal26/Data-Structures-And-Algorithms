package Java_Concepts.Generics.GenericsClass;

public class GenericsPair {
    public static void main(String[] args){
        Pair<Integer,String> pair = new Pair<>();
        pair.setKey(2);
        pair.setValue("Ansh");

        System.out.println(pair.getKey());
        System.out.println(pair.getValue());
        System.out.println(pair.toString());

    }
}

class Pair<K,V>{
    private K Key;
    private V Value;

    public K getKey(){
        return Key;
    }

    public V getValue(){
        return Value;
    }

    public void setKey(K Key){
        this.Key = Key;
    }

    public void setValue(V val){
        this.Value = val;
    }

    @Override
    public String toString() {
        return "["+Key+" , "+Value+"]";
    }
}