package Java_Concepts.OOPs.Constructors;

class Students{
	String name;
	int age;
	int rollno;
	
	public void Details() {
		System.out.println("Student Details - ");
		System.out.println(this.name);
		System.out.println(this.age);
		System.out.println(this.rollno);
	}
	
	Students(Students s2){
		System.out.println("Constructor called copy of s1");
		this.name = s2.name;
		this.age = s2.age;
		this.rollno = s2.rollno;
	}
	
	Students(String name,int age,int rollno){
		System.out.println("Constructor called of s1");
		this.name = name;
		this.age = age;
		this.rollno = rollno;
	}
	
}

public class ClassAndObjectsCopyConstuctor {
	public static void main(String args[]) {
		Students s1 = new Students("Ankit",20,28);
		s1.Details();
		
		Students s2 = new Students(s1);
		s2.Details();
		
	}

}
