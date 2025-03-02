package Java_Concepts.OOPs.AbstractionAndAccessModifiers;
class Account2{
	//protected Access Modifiers can be accessible in another package only in subclasses of this class
	// and accessible in every class in this package;
	protected String email;
}

public class AccessModifierProtected {
	public static void main(String args[]) {
		Account2 Acc1 = new Account2();
		Acc1.email = "anshjaiswalj26@gmail.com";
	}

}
