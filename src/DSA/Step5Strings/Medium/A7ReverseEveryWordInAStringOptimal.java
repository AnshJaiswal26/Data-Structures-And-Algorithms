package DSA.Step5Strings.Medium;

public class A7ReverseEveryWordInAStringOptimal {
	static String reverse(String s) {
		int n = s.length();
		String ans = "";
		
		for(int i=n-1;i>=1;i--) {
			if(s.charAt(i-1)==' ') {
				ans+=s.substring(i,n-ans.length());
			}
		}
	int l = ans.length();	
	return ans = ans.replace(ans.substring(l-2,l),ans.substring(l-2,l-1));
	}
	public static void main(String args[]) {
		String s = " Hello hii my jaiswal World ";
		String ans = reverse(s);
		System.out.print("'"+ans+"'");
	}
}
