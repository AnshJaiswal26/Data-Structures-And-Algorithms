package DSA.Step5Strings.Easy;
import java.util.Arrays;
import java.util.Comparator;

class pair{
	char a;
	int b;
	
	pair(char a,int b){
		this.a = a;
		this.b = b;
	}
	
	public static Comparator<pair> freq = new Comparator<pair>(){
		public int compare(pair a,pair b) {
			if(b.b==a.b) return -1;
			return b.b-a.b;
		}
	};
	
}

public class A81SortCharactersByFrequencyOptimal1 {
			
	static String Sort(String s) {
		pair[] alpha = new pair[97];
		
	    Arrays.fill(alpha, new pair('0',0));
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='a' && s.charAt(i)<='z') {
				alpha[s.charAt(i)-'a'] = new pair(s.charAt(i),alpha[s.charAt(i)-'a'].b+1);
			}
			else if(s.charAt(i)>='A' && s.charAt(i)<='A'){
				alpha[s.charAt(i)-'A'+26] = new pair(s.charAt(i),alpha[s.charAt(i)-'A'+26].b+1);
			}
			else {
				alpha[s.charAt(i)-'0'+52] = new pair(s.charAt(i),alpha[s.charAt(i)-'0'+52].b+1);
			}
		}
	
		Arrays.sort(alpha,pair.freq);
	
		String ans = "";
		for(int i=0;i<alpha.length;i++) {
			while(alpha[i].b>0) {
				ans+=alpha[i].a;
				alpha[i].b--;
			}
		}
		return ans;
 	}
	public static void main(String args[]) {
		String s = "tree";
		String ans = Sort(s);
		System.out.print(ans);
	}
}

