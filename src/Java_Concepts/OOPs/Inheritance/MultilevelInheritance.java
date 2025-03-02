package Java_Concepts.OOPs.Inheritance;

// Base class
class Shape2{
	String colour;
	
	public void area() {
		System.out.println("displays area");
		System.out.print(this.colour);
	}
}

// Derived class of Shape2 class & Base class of Rectangle1 class
class Rectangle extends Shape2{
	public void area(int l,int b) {
	System.out.print(" Rectangle = "+l*b);
	}
	
}

// Derived class of Rectangle class
class Rectangle1 extends Rectangle{
	public void area(int l,int b) {
	System.out.print(" Rectangle1 = "+l*b);
	}
	
} 

public class MultilevelInheritance {
	public static void main(String args[]) {
		
	}

}
