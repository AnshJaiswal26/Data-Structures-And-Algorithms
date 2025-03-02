package DSA.Step1LearnTheBasics.step2JavaCollections.A5Map.A3SortedMap;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;
import java.util.SortedMap;
import java.util.TreeMap;

import static java.util.Objects.hash;

public class SortedMapMethods {
    public static void main(String[] args){
        // sort keys in a specific order
        SortedMap<Integer,String> map = new TreeMap<>(); // default sorted order - ascending

        // Normal map methods
        map.put(6,"Bob");
        map.put(4,"Alice");
        map.put(3,"Paul");
        map.put(10,"Jack");
        map.put(8,"Rock");
        map.put(7,"Kane");
        System.out.println(map);
        System.out.println(map.get(3));
        System.out.println(map.getOrDefault(11,"null"));
        map.remove(4);
        map.isEmpty();
        map.containsKey(3);
        map.containsValue("null");

        // SortedMap methods
        System.out.println(map.firstEntry().getValue()); // returns first value
        System.out.println(map.lastEntry().getValue());  // returns last value
        System.out.println(map.firstKey());              // returns first key
        System.out.println(map.lastKey());               // returns last key
        System.out.println(map.headMap(6));        //  returns map from starting to 6 (excluded)
        System.out.println(map.tailMap(7));      //  returns map from 7 to last
        System.out.println(map.subMap(6,8));            //  returns subMap from 6 to 8

        SortedMap<Integer,String> map1 = new TreeMap<>((a,b)-> b-a); // custom sorted order - descending
        map1.put(6,"Bob");
        map1.put(4,"Alice");
        map1.put(3,"Paul");
        map1.put(10,"Jack");
        map1.put(8,"Rock");
        map1.put(7,"Kane");
        System.out.println(map1);

        // SortedMap of Objects
        SortedMap<Student,String> map2 = new TreeMap<>(); // ascending
        map2.put(new Student("Alice",8.5),"Student1");
        map2.put(new Student("Bob",7.5),"Student2");
        map2.put(new Student("Rock",7.5),"Student3");
        map2.put(new Student("Joy",6.5),"Student4");
        System.out.println(map2);

        // SortedMap of Objects
        SortedMap<Student,String> map3 = new TreeMap<>((a,b) -> {
            if(a.getCGPA()<b.getCGPA()) return 1;
            else if(a.getCGPA()>b.getCGPA()) return -1;
            else{
               return a.getName().compareTo(b.getName());
            }
        }); // descending
        map3.put(new Student("Alice",8.5),"Student1");
        map3.put(new Student("Bob",5.5),"Student2");
        map3.put(new Student("Rock",7.5),"Student3");
        map3.put(new Student("Joy",6.5),"Student4");
        System.out.println(map3);
    }
}

class Student implements Comparable<Student> {
    private String name;
    private double CGPA;

    Student(String name,double CGPA){
        this.CGPA = CGPA;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getCGPA() {
        return CGPA;
    }

    @Override
    public int hashCode() {
        return hash(name,CGPA);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(this.getClass() != obj.getClass()) return false;
        if(this == obj) return true;

        Student other = (Student) obj;
        return other.getCGPA() == this.CGPA && Objects.equals(other.getName(),this.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", CGPA=" + CGPA +
                '}';
    }

    @Override
    public int compareTo(@NotNull Student o) {
//      return Double.compare(this.getCGPA(),o.getCGPA());
//      Or we can write
        if(this.CGPA < o.getCGPA()) return -1;
        else if(this.CGPA > o.getCGPA()) return 1;
        else {
            return this.name.compareTo(o.getName());
        }
    }
}