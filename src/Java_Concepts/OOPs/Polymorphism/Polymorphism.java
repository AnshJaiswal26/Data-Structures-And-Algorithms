package Java_Concepts.OOPs.Polymorphism;

class StudentD{
	String name;
	int age;
	int rollno;
	
	// Function Overloading;
	public void Details(String name) {
		System.out.println(this.name);
	}
	
	public void Details(int age) {
		System.out.println(this.age);
		}
	
	public void Details(int rollno , String name) {
		System.out.println(this.name);
		System.out.println(this.rollno);
	}
	
	
}

public class Polymorphism {
	public static void main(String args[]) {
		
		StudentD s1 = new StudentD();
		s1.name = "Ankit";
		s1.age = 20;
		s1.rollno = 28;
		
		s1.Details(s1.rollno , s1.name);// compile time polymorphism
		
	}

}
