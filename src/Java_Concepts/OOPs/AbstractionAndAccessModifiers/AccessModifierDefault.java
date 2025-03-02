package Java_Concepts.OOPs.AbstractionAndAccessModifiers;

class Account1{
	//Default Access Modifiers can be accessible only in one package;
	String name;
}

public class AccessModifierDefault {
	public static void main(String args[]) {
		Account1 Acc1 = new Account1();
		Acc1.name = "Customer_name";
	}

}
