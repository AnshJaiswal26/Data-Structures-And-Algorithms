package DSA.Step5Strings.Easy;
import java.util.Stack;

public class A91MaximumDepthOfParenthesisBrute {
	static int CheckDepth(String s) {
		if(s.isEmpty()) return 0;
		
		Stack<Character> st = new Stack<>();
		int max = Integer.MIN_VALUE;
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='(') {
				st.push(s.charAt(i));
			}
			else if(s.charAt(i)==')'){
				max = Math.max(st.size(),max);
				st.pop();
			}
		}
		if(!st.isEmpty()) return -1;
		
		return max;
	}
	public static void main(String args[]) {
		String s = "(1)+((2))+(((((3)))))";
		int ans = CheckDepth(s);
		System.out.print(ans);
	}
}
