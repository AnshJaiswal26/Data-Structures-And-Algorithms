package Java_Concepts.OOPs.Inheritance;

// Base class
class Shape3{
	String colour;
	
	public void area() {
		System.out.println("displays area");
		System.out.print(this.colour);
	}
}

// Derived class of Shape class
class Triangle extends Shape3{
	
	public void area(int l) {
	System.out.print(" Square = "+l);
	}
	
}

// Derived class of Shape class
class Circle extends Shape3{
	
	public void area(int r) {
	System.out.print(" Circle = "+3.14*r*r);
	}
	
}

public class HierarchialInheritance {
	public static void main(String args[]) {
		
	}

}
