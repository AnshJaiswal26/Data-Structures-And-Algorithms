package DSA.Step1LearnTheBasics.step2JavaCollections.A6Set.A3SortedSet;

import org.jetbrains.annotations.NotNull;

import java.util.*;

import static java.util.Objects.hash;

public class SortedMapMethods {
    public static void main(String[] args){
        // sort keys in a specific order
        SortedSet<Integer> set = new TreeSet<>(); // default sorted order - ascending

        // Normal set methods
        set.add(6);
        set.add(4);
        set.add(3);
        set.add(10);
        set.add(8);
        set.add(7);
        System.out.println(set);
        set.remove(4);
        System.out.println(set.size());
        System.out.println(set.contains(3));

        // SortedSet methods
        System.out.println(set.first());    // returns first value
        System.out.println(set.last());     // returns last value
        System.out.println(set.headSet(6));     //  returns set from starting to 6 (excluded)
        System.out.println(set.tailSet(7));   //  returns set from 7 to last
        System.out.println(set.subSet(6,8));             //  returns subset from 6 to 8

        SortedSet<Integer> set1 = new TreeSet<>((a,b)-> b-a); // custom sorted order - descending
        set1.add(6);
        set1.add(4);
        set1.add(3);
        set1.add(10);
        set1.add(8);
        set1.add(7);
        System.out.println(set1);

        // SortedSet of Objects
        SortedSet<Student> set2 = new TreeSet<>(); // ascending
        set2.add(new Student("Alice",8.5));
        set2.add(new Student("Bob",7.5));
        set2.add(new Student("Rock",7.5));
        set2.add(new Student("Joy",6.5));
        set2.add(new Student("Joy",6.5));
        System.out.println(set2);

        // SortedSet of Objects
        SortedSet<Student> set3 = new TreeSet<>((a,b) -> {
            if(a.getCGPA()<b.getCGPA()) return 1;
            else if(a.getCGPA()>b.getCGPA()) return -1;
            else{
               return a.getName().compareTo(b.getName());
            }
        }); // descending
        set3.add(new Student("Alice",8.5));
        set3.add(new Student("Bob",5.5));
        set3.add(new Student("Rock",7.5));
        set3.add(new Student("Joy",6.5));
        System.out.println(set3);
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