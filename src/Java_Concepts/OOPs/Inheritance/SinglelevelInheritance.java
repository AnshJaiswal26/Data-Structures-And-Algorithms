package Java_Concepts.OOPs.Inheritance;

// Base class
class Shape1{
	String colour;
	
	public void area() {
		System.out.println("displays area");
		System.out.print(this.colour);
	}
}

// Derived class of Shape1 class
class Sqaure1 extends Shape1{
	
	public void area(int l) {
	System.out.print(" Square1 = "+l*l);
	}
	
}

public class SinglelevelInheritance {
	public static void main(String args[]) {
		
	}

}
