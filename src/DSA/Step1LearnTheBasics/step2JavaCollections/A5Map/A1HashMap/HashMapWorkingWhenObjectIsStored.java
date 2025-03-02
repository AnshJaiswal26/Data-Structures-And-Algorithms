package DSA.Step1LearnTheBasics.step2JavaCollections.A5Map.A1HashMap;

import java.util.HashMap;
import java.util.Objects;

import static java.util.Objects.hash;

public class HashMapWorkingWhenObjectIsStored {
    public static void main(String[] args){
        HashMap<Person,String> mpp = new HashMap<>();
        Person p1 = new Person("Alice",1);
        Person p2 = new Person("Bob",3);
        Person p3 = new Person("Alice",1);

//        mpp.put(p1,"Engineer"); // hashCode1-->index1
//        mpp.put(p2,"Designer"); // hashCode2-->index2
//        mpp.put(p3,"Manager"); // hashCode3-->index3
//        System.out.println(mpp.size());
//        System.out.println(p1+" - "+mpp.get(p1));
//        System.out.println(p3+" - "+mpp.get(p3));
        // now the problem occurs
        // here every object has new memory location
        // And here we need to replace Alice ,but it not happens
        // it takes every object as unique key
        // In this case we need to modify Person's hashCode() and equals() method which is already in Object class (Every class extends Object class)

        // After modifying Person's class hashCode() and equals() method
        mpp.put(p1,"Engineer"); // hashCode1-->index1
        mpp.put(p2,"Designer"); // hashCode2-->index2
        mpp.put(p3,"Manager"); // hashCode1-->index1
        System.out.println(mpp.size());
        System.out.println(p1+" - "+mpp.get(p1));
        System.out.println(p3+" - "+mpp.get(p3));


        HashMap<String,Integer> mpp1 = new HashMap<>();
        mpp1.put("Shubham",90); // hashCode1-->index1
        mpp1.put("Rani",93); // hashCode2-->index2
        mpp1.put("Shubham",99); // hashCode1-->index1-->equal()-->Replace
        System.out.println(mpp1);

    }
}

class Person{
    private String name;
    private int id;

    public Person(String name,int id){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        return hash(name,id);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(obj == this) return true;
        if(obj.getClass() != this.getClass()) return false;
        Person other = (Person) obj;
        return Objects.equals(other.getName(),name) && other.getId() == id;
    }

    @Override
    public String toString() {
        return "["+this.name+","+this.id+"]";
    }
}
