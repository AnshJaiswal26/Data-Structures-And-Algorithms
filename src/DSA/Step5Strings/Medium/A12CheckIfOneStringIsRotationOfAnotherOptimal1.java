package DSA.Step5Strings.Medium;

public class A12CheckIfOneStringIsRotationOfAnotherOptimal1{
	static boolean Check(String s1,String s2) {
		int n1 = s1.length();
		int n2 = s2.length();
		
		if(n1!=n2) return false;
		
		String add = s1+s1;
		
		if(add.contains(s2)) return true;
		
		return false;
	}
	public static void main(String args[]) {
		String s1 = "mypencil";
		String s2 = "encilmyp";
		
		boolean ans = Check(s1,s2);
		System.out.print(ans);
	}
}
