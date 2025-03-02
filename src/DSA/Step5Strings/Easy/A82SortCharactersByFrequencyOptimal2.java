package DSA.Step5Strings.Easy;
import java.util.PriorityQueue;

public class A82SortCharactersByFrequencyOptimal2 {
	static String Sort(String s) {
		PriorityQueue<pair> pq = new PriorityQueue<>((a,b)-> Integer.compare(b.b, a.b));
		
		int freqArr[] = new int[97];
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='a' && s.charAt(i)<='z') {
				freqArr[s.charAt(i)-'a']+=1;
			}
			else if(s.charAt(i)>='A' && s.charAt(i)<='A'){
				freqArr[s.charAt(i)-'A'+26]+=1;			
			}
			else {
				freqArr[s.charAt(i)-'0'+52]+=1;		
			}
		}
	
		for(int i=0;i<freqArr.length;i++) {
			if(freqArr[i]!=0 && i<26) {
				char ch = (char)('a'+i);
				pq.add(new pair(ch,freqArr[i]));
			}
			else if(freqArr[i]!=0 && i>=26 && i<52) {
				char ch = (char)('A'+i-26);
				pq.add(new pair(ch,freqArr[i]));
			}
			else if(freqArr[i]!=0 && i>=52 && i<97){
				char ch = (char)('0'+i-52);
				pq.add(new pair(ch,freqArr[i]));
			}
		}
		
		String ans = "";
		while(!pq.isEmpty()) {
			int freq = pq.peek().b;
			while(freq-->0) {
				pair p = pq.peek();
				ans+=p.a;	
			}
			pq.poll();
		}
			
			return ans;
	}
	public static void main(String args[]) {
		String s = "TREE";
		String ans = Sort(s);
		
		System.out.print(ans);
	}
}
