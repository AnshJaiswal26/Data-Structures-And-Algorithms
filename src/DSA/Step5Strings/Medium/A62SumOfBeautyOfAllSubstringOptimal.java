package DSA.Step5Strings.Medium;
import java.util.Map;
import java.util.HashMap;
import java.util.PriorityQueue;

public class A62SumOfBeautyOfAllSubstringOptimal {
	static int Sum(String s) {
		Map<Character,Integer> mpp = new HashMap<>();
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		int n = s.length();
		int ans = 0;
		
		for(int i=0;i<n;i++) {	
			mpp.clear();
			pq.clear();
			int max = Integer.MIN_VALUE;
			int min = Integer.MAX_VALUE;
			
			for(int j=i;j<n;j++) {
				
				int val = mpp.getOrDefault(s.charAt(j),0);
				if(mpp.containsKey(s.charAt(j))) pq.remove(val);
				
				mpp.put(s.charAt(j),val+1);
			    pq.add(val+1);
				
				max = Math.max(val+1, max);
				min = pq.peek();
				
				ans = ans+(max-min);
			}
		}	
		return ans;
	}
	public static void main(String args[]) {
		String s = "aabcbaa";
		int ans = Sum(s);
		System.out.print(ans);
	}
}
