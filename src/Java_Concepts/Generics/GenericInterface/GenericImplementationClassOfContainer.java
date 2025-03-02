package Java_Concepts.Generics.GenericInterface;

// implementation class of Container Interface
public class GenericImplementationClassOfContainer<T> implements Container<T> {
    private T item;

    @Override
    public void add(T item){
        this.item = item;
    }

    @Override
    public T get(){
        return item;
    }
}
