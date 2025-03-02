package Java_Concepts.OOPs.Interfaces;

interface Vechile{
	// every field is public, static, final; 
	int controller = 1;
	// methods are public and abstract by default
	void move();
	
	// all the methods defined in the interface must be present in every class which implements that interface
}

interface Fuel{
	
	void Fueltype();
}

// In interfaces we can use multiple inheritance concept
class Car implements Vechile,Fuel{
	 public void move() {
		 System.out.println("Car runs on road");
		 System.out.println("controller = "+controller);
	 }
	 
	 public void Fueltype() {
		 System.out.print("Feul type = Petrol");
	 }
}

class Aeroplane implements Vechile{
	 public void move() {
		 System.out.print("Aeroplane Flys in air");
		 System.out.println("controller = "+controller);
	 }
}

public class Interfaces {
	public static void main(String args[]) {
		Car c1 = new Car();
		c1.move();
		c1.Fueltype();
		
	}

}
