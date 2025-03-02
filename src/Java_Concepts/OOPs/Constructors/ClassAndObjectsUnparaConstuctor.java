package Java_Concepts.OOPs.Constructors;

class StudentDetails{
	String name;
	int age;
	int rollno;
	
	public void Details() {
		System.out.println("Student Details - ");
		System.out.println(this.name);
		System.out.println(this.age);
		System.out.println(this.rollno);
	}
	
	StudentDetails(){
		System.out.println("Constructor called");
	}
}
public class ClassAndObjectsUnparaConstuctor {
	public static void main(String args[]) {
		StudentDetails s1 = new StudentDetails();
		s1.name = "Ankit";
		s1.age = 20;
		s1.rollno = 28;
		s1.Details();
		
		StudentDetails s2 = new StudentDetails();
		s2.name = "Ankush";
		s2.age = 21;
		s2.rollno = 45;
		s2.Details();
	}

}
