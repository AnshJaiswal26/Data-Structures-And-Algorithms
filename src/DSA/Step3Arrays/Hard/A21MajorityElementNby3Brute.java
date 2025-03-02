package DSA.Step3Arrays.Hard;
import java.util.*;
public class A21MajorityElementNby3Brute {
	public static void main(String args[]) {
		int[] arr = {5,3,5,3,5,8,9,3};
		int s= arr.length;
		
		List<Integer> RepeatNum = new ArrayList<>(s/3);
		
		int count;
		for(int i=0;i<s;i++ ) {
			count=0;
			for(int j=i;j<s;j++){
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(count>s/3) {
				RepeatNum.add(arr[i]);
			}
			if(RepeatNum.size()==2) {
				break;
			}
		}
		
		for(int ele:RepeatNum) {
			System.out.print(ele+" ");
		}
		
	}

}
