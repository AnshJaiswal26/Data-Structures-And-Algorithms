package DSA.Step1LearnTheBasics.step2JavaCollections.A4Comparable;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class ComparableExample {
    public static void main(String[] args){
        List<Student> list = new ArrayList<>();
        list.add(new Student("Alice",5.5));
        list.add(new Student("Jack",4.5));
        list.add(new Student("Joy",7.0));
        list.add(new Student("Bob",7.0));
        list.add(new Student("Rock",9.5));

        // to set the default order to sort class objects we will use Comparable
        // And comparable is use inside classes to tell the default sorting order
        // it is similar to comparator
        list.sort(null);
        for(Student s : list){
            System.out.println(s);
        }
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