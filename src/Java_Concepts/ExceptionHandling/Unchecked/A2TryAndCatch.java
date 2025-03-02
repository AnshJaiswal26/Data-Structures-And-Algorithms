package Java_Concepts.ExceptionHandling.Unchecked;

class Student{
	int id;
	String name;

	void setId(int s){
		this.id = s;
	}
}

public class A2TryAndCatch {
	static void Method(int[] numerator ,int[] denominator) {
		
		for(int i=0;i<10;i++) {
			try {
				System.out.println(divide(numerator[i],denominator[i]));
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	}
	static int divide(int a,int b) {
		Student student = null;
		
		try {
			
			student.setId(343);
			System.out.println(student);
			return a/b; 
			
		}catch(NullPointerException e) {
			
			System.out.println("Null Pointer Exception : )");
			return -1;
			
		}catch(Exception e) {
			
			System.out.println(e);
			return -1;
		}
		
	}
	public static void main(String args[]) {
		int[] numerator = {23,45,6,78};
		int[] denominator = {2,5,0,4};
		
		Method(numerator,denominator);
	}
}
