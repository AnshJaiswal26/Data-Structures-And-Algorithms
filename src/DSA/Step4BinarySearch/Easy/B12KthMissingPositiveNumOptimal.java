package DSA.Step4BinarySearch.Easy;

public class B12KthMissingPositiveNumOptimal {
	static int BSMissingPos(int[] arr,int l,int k) {
		int s=0,e=l-1;
		int ans1=l+k;
		
		if(k<arr[s]) return k;
		
		if(ans1>arr[e]) {
			ans1= l+k;
			return ans1;
		}
		
		while(s<=e) {
			int mid = s+(e-s)/2;
			
			int noofmiss = arr[mid]-(mid+1);
			
			if(noofmiss<k) {
				s=mid+1;
			}
			else {
				e=mid-1;
			}
		}

			int ans = (arr[s]-arr[e])+k;
			return ans;
		
	}
	
	public static void main(String args[]) {
		int[] arr = {2, 3, 4, 7, 11};
		int s = arr.length;
		int k=5;
		
		int ans = BSMissingPos(arr,s,k);
		
		System.out.print(k+"th missing element is "+ans);
	}

}
