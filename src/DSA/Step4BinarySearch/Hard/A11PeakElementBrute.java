package DSA.Step4BinarySearch.Hard;

public class A11PeakElementBrute {
	static void PeakElement(int[] arr,int l ) {
		
		for(int i=0;i<l;i++) {	
			if((i==0 || arr[i-1]<arr[i]) && (i==l-1 || arr[i]>arr[i+1])) {
				System.out.print(arr[i]+" ");
			}
		}
	}
	public static void main(String args[]) {
		int[] arr = {1,2,3,4,5,6,7,8,5,1};
		int l = arr.length;
		
		PeakElement(arr,l);
	}

}
