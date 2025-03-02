package Java_Concepts.OOPs.AbstractionAndAccessModifiers;

abstract class Animal{
	abstract void walks();
	public void eats() {
		System.out.println("eats");
	}
	
	Animal(){
		System.out.println("You are creating a new Animal");
	}
}

class Horse extends Animal{
	public void walks() {
		System.out.println("walks on 4 legs");
	}
	Horse(){
		System.out.println("created a horse");
	}
}

class Chicken extends Animal{
	public void walks() {
		System.out.println("walks on 2 legs");
	}
}

public class Abstraction {
	public static void main(String args[]) {
		Horse h1 = new Horse();
		h1.walks();
		h1.eats();
	}
}
