package Java_Concepts.OOPs.Inheritance;

// Base class
class Shape4{
	String colour;
	
	public void area() {
		System.out.println("displays area");
		System.out.print(this.colour);
	}
}

// Derived class of Shape class
class Sqaure extends Shape4{
	
	public void area(int l) {
	System.out.print(" Square = "+l*l);
	}
	
}

// Derived class of Shape class & base class of Circle2 class
class Circle1 extends Shape4{
	
	public void area(int r) {
	System.out.print(" Circle = "+3.14*r*r);
	}
	
}

//Derived class of Circle1 class
class Circle2 extends Circle1{
	
	public void area(int r1) {
	System.out.print(" Circle1 = "+3.14*r1*r1);
	}
	
}

public class HybridInheritance {
	public static void main(String args[]) {
		
	}

}
