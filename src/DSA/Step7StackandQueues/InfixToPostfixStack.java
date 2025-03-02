package DSA.Step7StackandQueues;
import java.util.Stack;

public class InfixToPostfixStack {
	static int Priority(char x) {
		if(x == '+' || x == '-') return 1;
		if(x == '*' || x == '/') return 2;
		if(x == '^') return 3;
		return -1;
	}
	
	static String Convert(String s) {
		Stack<Character> st = new Stack<>();
		String ans = "";
		
		for(char i = 0;i<s.length();i++) {
//			if(s.charAt(i)>='A' && s.charAt(i)<='Z' || s.charAt(i)>='a' && s.charAt(i)<='z' || s.charAt(i)>='0' && s.charAt(i)<='9') {
//				ans = ans+s.charAt(i);
//			}
//			Or we can write
			if(Character.isLetterOrDigit(s.charAt(i))) {
				ans +=s.charAt(i);
			}
			else if(s.charAt(i)=='(') st.push(s.charAt(i));
			else if(s.charAt(i)==')') {
				while(!st.isEmpty() && st.peek()!='(') {
					ans = ans+st.pop();
				}
				st.pop();
			}
			else {
				while(!st.isEmpty() && Priority(st.peek())>=Priority(s.charAt(i))) {
					ans+=st.pop();
				}
				st.push(s.charAt(i));
			}	
		}
		while(!st.isEmpty()) ans+=st.pop();
		
		return ans;
	}
	public static void main(String args[]) {
		String s = "A+(B*C-(D/E^F)*G)*H";
		String ans = Convert(s);
		
		System.out.println("Infix to Postfix");
		System.out.println("Infix - "+s);
		System.out.print("Postfix - "+ans);
	}

}
