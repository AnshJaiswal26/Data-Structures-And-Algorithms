package DSA.Step3Arrays.Hard;
import java.util.*;
public class A22MajorityElementNby3Better {
	public static void main(String args[]) {
		int [] arr = {5,3,5,3,5,8,9,3};
		int s = arr.length;
		int mini = (s/3)+1;
		
		Map<Integer,Integer> mpp = new HashMap<>(); 
		List<Integer> ele = new ArrayList<>(s/3);
	
		for(int i=0;i<s;i++) {
		   int value =  mpp.getOrDefault(arr[i],0);
		   mpp.put(arr[i],value+1);
		   
		   if(mpp.get(arr[i])==mini) {
			   ele.add(arr[i]);
		   }
		   
		   if(ele.size()==2) {
			   break;
		   }
		}
		
		for(int val:ele) {
			System.out.print(val+" ");
		}
	}

}
