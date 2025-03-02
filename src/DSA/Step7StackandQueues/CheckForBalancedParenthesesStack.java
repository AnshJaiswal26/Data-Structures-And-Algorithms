package DSA.Step7StackandQueues;
import java.util.Stack;

public class CheckForBalancedParenthesesStack {
	static boolean Check(String stri) {
		Stack<Character> st = new Stack<>();
		
		for(char i = 0;i<stri.length();i++) {
			if(stri.charAt(i) == '(' || stri.charAt(i) == '{' || stri.charAt(i) == '[') {
				st.push(stri.charAt(i));
			}
			else {
				if(st.isEmpty()) return false; 
				
				char x = stri.charAt(i);
				
				if(x=='}' && st.pop()=='{' || x ==')' && st.pop()=='(' || x==']' && st.pop()=='[');
				else return false;
			}	
		}
		
		if(st.isEmpty()) return true;
		return false;
	}
	
	public static void main(String args[]) {
		
		String s = "()(((({([])}))))[]";
		
		boolean ans = Check(s);
		System.out.print(ans);
	}
}
