package DSA.Step5Strings.Medium;

public class A11CheckIfOneStringIsRotationOfAnotherBrute {
	static boolean Check(String s1,String s2) {
		int n1 = s1.length();
		int n2 = s2.length();
		
		if(n1!=n2) return false;
		
		for(int i=1;i<=n1;i++) {
			if(s2.equals(s1.substring(i,n1)+s1.substring(0,i))) return true;
		}
		
		return false;
	}
	public static void main(String args[]) {
		String s1 = "mypencil";
		String s2 = "encilmyp";
		
		boolean ans = Check(s1,s2);
		System.out.print(ans);
	}
}
