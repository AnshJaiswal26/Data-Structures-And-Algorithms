package DSA.Step5Strings.Medium;

public class A13CheckIfOneStringIsRotationOfAnotherOptimal2{
	static boolean Check(String s1,String s2) {
		int n1 = s1.length();
		int n2 = s2.length();
		
		if(n1!=n2) return false;
		else if(s1.equals(s2)) return true;
		
		String ss = s1+s1;
		int i=0,j=0;
		
		while(j<n1+n2) {
			if(ss.charAt(j) == s2.charAt(i)) {
				j++;
				i++;
				if(i==n2) return true;
			}
			else if(i!=0) i--;
			else j++;
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
