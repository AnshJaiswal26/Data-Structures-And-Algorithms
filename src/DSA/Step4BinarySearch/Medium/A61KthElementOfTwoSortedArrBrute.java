package DSA.Step4BinarySearch.Medium;

public class A61KthElementOfTwoSortedArrBrute {
	public static void main(String args[]) {
		int[] arr1 = {1, 3, 4, 7, 10, 12};
		int[] arr2 = {2, 3, 6, 15};
		int tl =  arr1.length+arr2.length;
		int k = 4;
		//1 2 3 3 4 6 7 10 12 15
		int[] arr3 = new int[tl];
		
		int a1=0,a2=0,ind = 0;
		
		while(a1<arr1.length && a2<arr2.length) {
			if(arr1[a1]>arr2[a2]) {
				arr3[ind]=arr2[a2];
				a2++; ind++;
			}
			else {
				arr3[ind]=arr1[a1];
				a1++; ind++;
			}
		}
		
		while(a1<arr1.length) {
			arr3[ind]=arr1[a1];
			a1++; ind++;
		}
		while(a2<arr2.length) {
			arr3[ind]=arr2[a2];
			a2++; ind++;
		}
		
		int ans = arr3[k-1];
		System.out.print(ans);
	
	
	}

}
