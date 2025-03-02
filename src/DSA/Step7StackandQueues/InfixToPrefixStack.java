package DSA.Step7StackandQueues;
import java.util.Stack;

public class InfixToPrefixStack {
	
	static int Priority(char x) {
		if(x == '+' || x == '-') return 1;
		else if(x == '*' || x == '/') return 2;
		else if(x == '^') return 3;
		else return -1;
	}
	
	static String Reverse(char[] exp) {
		
		int start = 0;
		int end = exp.length-1;
		char temp;
		
		while(start<end) {
			if(exp[start] == '(' || exp[start] == ')') {
				if(exp[start] == '(') {
					exp[start] = ')'; 
				}
				else {
					exp[start] = '(';
				}
			}				
		    if(exp[end] == '(' || exp[end] == ')') {
				if(exp[end] == '(') {
					exp[end] = ')'; 
				}
				else {
					exp[end] = '(';
				}
			}
			temp = exp[end];
			exp[end] = exp[start];
			exp[start] = temp;
			start++;
			end--;
		}
		
		return String.valueOf(exp);
	}
	
	static String Convert(String exp) {
		exp = Reverse(exp.toCharArray());
		
		Stack<Character> st = new Stack<>();
		String ans = "";
		
		for(char i=0;i<exp.length();i++) {
			if(Character.isLetterOrDigit(exp.charAt(i))) ans+=exp.charAt(i);
			else if(exp.charAt(i) == '(') st.push(exp.charAt(i));
			else if(exp.charAt(i) == ')') {
				while(!st.isEmpty() && st.peek()!='(') {
					ans+=st.pop();
				}
				if(!st.isEmpty())st.pop();
			}
			else {
				if(exp.charAt(i) == '^') {
					while(!st.isEmpty() && Priority(st.peek())>=Priority(exp.charAt(i))) {
						ans+=st.pop();
					}
				}
				else {
					while(!st.isEmpty() && Priority(st.peek())>Priority(exp.charAt(i))) {
						ans+=st.pop();
					}
				}
				st.push(exp.charAt(i));
			}
		}
		
		while(!st.isEmpty()) ans+=st.pop();
		
		ans = Reverse(ans.toCharArray());
		return ans;
	}
	public static void main(String args[]) {
		String exp = "(p+q)*(c-d)";
		String ans = Convert(exp);
		
		System.out.println("Infix to Prefix");
		System.out.println("Infix - (p+q)*(c-d)");
		System.out.print("Prefix - "+ans);
		
	}
}
