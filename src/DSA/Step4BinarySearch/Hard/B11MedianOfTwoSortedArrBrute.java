package DSA.Step4BinarySearch.Hard;

public class B11MedianOfTwoSortedArrBrute {
	public static void main(String args[]) {
		int[] arr1 = {1, 3, 4, 7, 10, 12};
		int[] arr2 = {2, 3, 6, 15};
		int tl =  arr1.length+arr2.length;
		
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
		
		int s=0,e=arr3.length-1;
		
		if(arr3.length%2==0) {
			int mid = (s+e)/2;
			int ans = (arr3[mid]+arr3[mid+1])/2;
			System.out.print(ans);
		}
		else {
			int ans = (s+e)/2;
			System.out.print(ans);
		}
	
	}

}
