package DSA.Step4BinarySearch.Medium;

public class A62KthElementOfTwoSortedArrBetter {
	public static void main(String args[]) {
		int[] arr1 = {1, 3, 4, 7, 10, 12};
		int[] arr2 = {2, 3, 6, 15};
		int k = 6;
		
		//1 2 3 3 4 6 7 10 12 15 
		int ind = k-1;
		int cnt=0;
		int a1=0,a2=0;
		int indele = -1;
		
		while(a1<arr1.length && a2<arr2.length) {
			if(arr1[a1]<arr2[a2]){
				if(ind==cnt) indele=arr1[a1];
				cnt++;
				a1++;
			}
			else {
				if(ind==cnt) indele=arr2[a2];
				cnt++;
				a2++;
			}
		}
		
		while(a1<arr1.length) {
			if(ind==cnt) indele=arr1[a1];
			cnt++;
			a1++;	
		}
		
		while(a2<arr2.length) {
			if(ind==cnt) indele=arr2[a2];
			cnt++;
			a2++;	
		}
		
		System.out.print(indele);
	}

}
