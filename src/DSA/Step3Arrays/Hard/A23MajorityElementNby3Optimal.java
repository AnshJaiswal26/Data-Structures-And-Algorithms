package DSA.Step3Arrays.Hard;
import java.util.*;
public class A23MajorityElementNby3Optimal {
	
	static List<Integer> MajorityElement(int arr[],int s){
		int el1 = Integer.MIN_VALUE;
		int el2 = Integer.MIN_VALUE;
		int cnt1=0,cnt2=0;
		
		for(int i=0;i<s;i++) {
			if(cnt1==0 && el2!=arr[i]) {
				el1=arr[i];
				cnt1=1;
			}
			else if(cnt2==0 && el1!=arr[i]) {
				el2=arr[i];
				cnt2=1;
			}
			else if(arr[i]==el1) cnt1++;
			else if(arr[i]==el2) cnt2++;
			
			else {cnt1--;
			      cnt2--;}
		}
		
		List<Integer> count = new ArrayList<>();
		int mini=(s/3)+1;
		cnt1=0;
		cnt2=0;
		 
		for(int i=0;i<s;i++) {
			 
			 if(el1==arr[i]) cnt1++;
			 if(el2==arr[i]) cnt2++;
		}
		
		if(cnt1>=mini) {
			count.add(el1);
		}
		if(cnt2>=mini) {
			count.add(el2);
		}
		
		return count;
	}
	
	public static void main(String args[]) {
		int[] arr = {5,3,5,3,5,8,9,3};
		int s = arr.length;
		
		List<Integer> ans = MajorityElement(arr,s);
		
		for(int i=0;i<ans.size();i++) {
			System.out.print(ans.get(i)+" ");
		}
	}
}



