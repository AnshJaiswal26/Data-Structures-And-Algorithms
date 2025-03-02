package DSA.Step5Strings.Medium;
import java.util.Map;
import java.util.HashMap;

public class A61SumOfBeautyOfAllSubstringBrute {
	static int Sum(String s) {
		int n = s.length();
		int ans = 0;
		
		for(int i=0;i<n;i++) {	
			Map<Character,Integer> mpp = new HashMap<>();
			
			for(int j=i;j<n;j++) {
				
					int val = mpp.getOrDefault(s.charAt(j),0);
					mpp.put(s.charAt(j),val+1);
				
					int l_f = Integer.MAX_VALUE,h_f = Integer.MIN_VALUE;
					for(Map.Entry<Character,Integer> it: mpp.entrySet()){
						h_f = Math.max(it.getValue(),h_f);
						l_f = Math.min(it.getValue(),l_f);
					}
					
				ans+=(h_f-l_f);
			}
		}	
		return ans;
	}
	public static void main(String args[]) {
		String s = "aabcb";
		int ans = Sum(s);
		System.out.print(ans);
	}
}
