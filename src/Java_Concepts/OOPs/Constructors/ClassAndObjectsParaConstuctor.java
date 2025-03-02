package Java_Concepts.OOPs.Constructors;

class Student{
	String name;
	int age;
	int rollno;
	
	public void Details() {
		System.out.println("Student Details - ");
		System.out.println(this.name);
		System.out.println(this.age);
		System.out.println(this.rollno);
	}
	
	Student(String name,int age,int rollno){
		System.out.println("Constructor called");
		this.name = name;
		this.age = age;
		this.rollno = rollno;
	}
}

public class ClassAndObjectsParaConstuctor {
	public static void main(String args[]) {
		Student s1 = new Student("Ankit",20,28);
		s1.Details();
		
	}

}
