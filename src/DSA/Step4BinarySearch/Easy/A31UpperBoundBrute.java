package DSA.Step4BinarySearch.Easy;

public class A31UpperBoundBrute {
	static int UB(int[] arr,int x) {
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>x) {
				return i;
			}
		}
		return arr.length;
	}
	public static void main(String args[]) {
		int[] arr = {2,3,6,7,8,8,11,11,11,12};
		int x = 8;
		
		int UpperBound = UB(arr,x);
		
		System.out.print(UpperBound);
	}

}
