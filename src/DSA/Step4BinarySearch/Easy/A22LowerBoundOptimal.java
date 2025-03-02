package DSA.Step4BinarySearch.Easy;

public class A22LowerBoundOptimal {
	static int LBBinarySearch(int[] arr,int x) {
		int s=0;
		int e=arr.length-1;
		int ans = arr.length;
		while(s<=e) {
			int mid = s+(e-s)/2;
			
			if(arr[mid]>=x) {
				ans=mid;
				e=mid-1;
			}
			else{
				s=mid+1;
			}	
		}
		return ans;
	}
	public static void main(String args[]) {
		int[] arr = {3, 5, 8, 15, 19};
		int x=9;
		
		int LowerBound=LBBinarySearch(arr,x);
		System.out.print("index "+LowerBound);
	}

}
