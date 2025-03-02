package DSA.Step3Arrays.Medium;
import java.util.*;
public class A71LeadersInAnArrayBrute {
	public static void main(String args[]) {
		
		ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(10,22,12,3,0,6));
		ArrayList<Integer> arrofld = new ArrayList<>();
		int s=arr.size();
		int leader ;
	
		for(int i=0;i<s;i++) {
			
			leader = 0;
			
			for(int j=i+1;j<s;j++) {
				
				if(arr.get(j)>arr.get(i)) {
					leader = 1;
					break;
				}
			}
			if(leader == 0) {
			arrofld.add(arr.get(i));
			}
		}
		
		for(int val : arrofld) {
			System.out.print(val+" ");
		}
	}

}
