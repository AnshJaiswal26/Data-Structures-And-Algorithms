package DSA.Step4BinarySearch.Hard;

public class A12PeakElementOptimal {
	static int PeakElement(int[] arr,int l) {
		int s=1,e=l-2;
		
		if(l==1) {
			return arr[0];
		}
		
		if(arr[0]>arr[1]) {
			return arr[0];
		}
		else if (arr[l-1]>arr[l-2]) {
			return arr[l-1];
		}
		
		while(s<=e) {
			int mid = s+(e-s)/2;
			
			if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]) {
				return arr[mid];
			}
			
			else if(arr[mid]>arr[mid-1]) {
				s=mid+1;
			}
			else {
				e=mid-1;
			}
		}
		
		return -1;
	}
	public static void main(String args[]) {
		int[] arr = {4,2,3,4,5,6,7,8,5,1};
		int l = arr.length;
		
		int ans = PeakElement(arr,l);
		System.out.print(ans);
	}

}
