package Java_Concepts.OOPs;
class EachStudent{
	String name;
	static String School;
	
	public static void ChangeSchool() {
	   School = "DPS";
	}
}

public class Static {
	public static void main(String args[]) {
		EachStudent.School = "VCHS";
		
		EachStudent st1 = new EachStudent();
		st1.name = "Raj";
		System.out.println(st1.School);
		
		st1.ChangeSchool();
		System.out.println(st1.School);
	}

}
