package DSA.Step3Arrays.Medium;
import java.util.*;
public class A32MajorityElementNby2Better {
	public static void main(String args[]) {
		int[] arr = {2,2,4,2,3,1,2};
		int s = arr.length;
		HashMap<Integer,Integer> ouccur = new HashMap<>();
		
		for(int i=0;i<s;i++) {
			int value = ouccur.getOrDefault(arr[i],0);
				ouccur.put(arr[i],value+1);
		}
		
		for(Map.Entry<Integer,Integer> it : ouccur.entrySet()) {
			if(it.getValue()> s/2) {
				System.out.print(it.getKey());
			}
		}
	}
}
