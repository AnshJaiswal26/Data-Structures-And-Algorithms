package Java_Concepts.OOPs.ClassAndObjects;

class Pen{
	String colour;
	String type;
	
	public void PenFunct() {
		System.out.print("writing something");
	}
}
public class ClassAndObjects {
	public static void main(String args[]) {
		Pen p1 = new Pen();
		p1.colour = "blue";
		p1.type = "ballpen";
		p1.PenFunct();
	}
}
