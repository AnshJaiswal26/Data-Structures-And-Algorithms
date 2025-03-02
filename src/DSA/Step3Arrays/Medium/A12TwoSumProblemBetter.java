package DSA.Step3Arrays.Medium;
import java.util.*;
public class A12TwoSumProblemBetter {
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		
		int t;
		t=Sc.nextInt();
		
		int[] arr = {1,2,1,7,5};
		
		int n[]  = sum(arr,t);
		
		System.out.print("elements present on index "+n[0]+" & "+n[1]);
	}
	
	public static int[] sum(int arr[],int t) {
		
		Map<Integer,Integer> mpp = new HashMap<>();
		
		int s;
		s=arr.length;
		int[] ans = new int[2];
		ans[0]=ans[1]=-1;
		
		for(int i=0;i<s;i++) {
			int rem = t-arr[i];
			
			if(mpp.containsKey(rem)) {
				ans[0]= mpp.get(rem);
				ans[1]=i;
				return ans;
			}
			mpp.put(arr[i],i);
		}
		return ans;
		
	}

}
