package DSA.Step3Arrays.Hard;

import java.util.Arrays;

public class A82Merge2SortedArrOptimal1 {
	public static void main(String args[]) {
		int[] arr1 = {1,3,5,7};
		int[] arr2 = {0,2,6,8,9};
		
		int as1=arr1.length;
		int as2=arr2.length;
		
		int p1 = as1-1;
		int p2 = 0;
		
		while(arr1[p1]>=arr2[p2]) {
			int temp = arr1[p1];
			arr1[p1]=arr2[p2];
			arr2[p2]=temp;
			p1--;
			p2++;
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		for(int i=0;i<as1;i++) {
			System.out.print(arr1[i]+" ");
		}
		for(int i=0;i<as2;i++) {
			System.out.print(arr2[i]+" ");
		}
	}

}
