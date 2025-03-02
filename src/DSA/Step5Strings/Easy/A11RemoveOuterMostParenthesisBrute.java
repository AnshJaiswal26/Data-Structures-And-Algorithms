package DSA.Step5Strings.Easy;
import java.util.Stack;

public class A11RemoveOuterMostParenthesisBrute {
	static String RemoveOuterMostPara(String s) {
		Stack<Character> st = new Stack<>();
		int n = s.length();
		String ans = "";
		
		for(int i=0;i<n;i++) {
			if(!st.isEmpty() && s.charAt(i)==')') {
				st.pop();
				if(!st.isEmpty()) ans+=s.charAt(i);
			}
			else {
				if(!st.isEmpty()) ans+=s.charAt(i);
				st.push(s.charAt(i));
			}
		}
		
		return ans;
	}
	public static void main(String args[]) {
		String s = "((()))(()())";
		
		String ans = RemoveOuterMostPara(s);
		System.out.print(ans);
	}
}
