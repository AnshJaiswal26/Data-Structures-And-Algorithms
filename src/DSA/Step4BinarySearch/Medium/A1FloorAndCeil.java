package DSA.Step4BinarySearch.Medium;

public class A1FloorAndCeil {
	static int FindFloor(int[] arr,int x) {
		int s=0,e=arr.length-1;
		int ans=-1;
		
		while(s<=e) {
			int mid = s+(e-s)/2;
			if(arr[mid]<=x) {
				ans = arr[mid];
				s=mid+1;
			}
			else {
				e=mid-1;
			}
		}
		return ans;
	}
	static int FindCeil(int[] arr,int x) {
		int s=0,e=arr.length-1;
		int ans=-1;
		
		while(s<=e) {
			int mid = s+(e-s)/2;
			
			if(arr[mid]>=x) {
				ans = arr[mid];
				e=mid-1;
			}
			else {
				s=mid+1;
			}
		}
		return ans;
	}
	public static void main(String args[]) {
		int[] arr = {10,20,30,40,50};
		int x = 25;
		
		int Floor = FindFloor(arr,x);
		int Ceil = FindCeil(arr,x);
		
		System.out.print("Floor is "+Floor+" & Ceil is "+Ceil);
	}

}
