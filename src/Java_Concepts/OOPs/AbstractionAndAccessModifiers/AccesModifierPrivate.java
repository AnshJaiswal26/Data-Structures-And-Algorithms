package Java_Concepts.OOPs.AbstractionAndAccessModifiers;

class Account3{
	String name;
	protected String email;
	
	// private Access Modifiers can be accessible only in this class 
	// To access this private Access modifiers we have to create a functions like getters and setters
	private String password;
	
	// getters and setters
	public String getPassword() {
		setPassword("abcd");
		return this.password;
	}
	
	private void setPassword(String pass) {
		this.password = pass;
	}
}

public class AccesModifierPrivate {
	public static void main(String args[]) {
		Account3 Acc1 = new Account3();
		//Acc1.setPassword("abcd");
		System.out.print(Acc1.getPassword());
	}

}
