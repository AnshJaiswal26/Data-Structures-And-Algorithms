package DSA.Step5Strings.Easy;

public class A3LargestOddNumInStringOptimal {
	static String findlargestodd(String s) {
		int n = s.length();
		
		for(int i=n-1;i>=0;i--) {
			if(s.charAt(i)%2==1) {
			  return s.substring(0,i+1);
			}
		}
		return "";
	}
	public static void main(String args[]) {
		String s = "3542786";
		String ans = findlargestodd(s);
		System.out.print(ans);
	}
}
