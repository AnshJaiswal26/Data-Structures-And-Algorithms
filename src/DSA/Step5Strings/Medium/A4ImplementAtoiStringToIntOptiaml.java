package DSA.Step5Strings.Medium;

public class A4ImplementAtoiStringToIntOptiaml {
	static int Convert(String s) {
		int sum = 0;
		
		for(int i=0;i<s.length();i++) {
			sum=(sum+s.charAt(i)-'0')*10;
		}
		sum = sum/10;
		
		return sum;
	}
	public static void main(String args[]) {
		String s = "7678";
		int ans = Convert(s);
		System.out.print(ans);
	}
}
