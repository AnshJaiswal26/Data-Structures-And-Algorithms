package Java_Concepts.OOPs.AbstractionAndAccessModifiers;

class Account{
	// Access Modifiers type 1 public which is accessible in this class but also accessible in another package
	public String name;
	
}

public class AccessModifierPublic {
	public static void main(String arbgs[]) {
		Account Ac1 = new Account();
		Ac1.name = "Customer_name";
	}

}
