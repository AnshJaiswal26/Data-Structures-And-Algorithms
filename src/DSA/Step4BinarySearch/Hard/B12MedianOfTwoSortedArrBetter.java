package DSA.Step4BinarySearch.Hard;

public class B12MedianOfTwoSortedArrBetter {
	public static void main(String args[]) {
		int[] arr1 = {1, 3, 4, 7, 10, 12};
		int[] arr2 = {2, 3, 6, 15};
		
		int tl =  arr1.length+arr2.length;
		
		int ind2=tl/2,ind1=ind2-1;
		int cnt=0;
		int a1=0,a2=0;
		int ind1ele = -1,ind2ele = -1;
		
		while(a1<arr1.length && a2<arr2.length) {
			if(arr1[a1]<arr2[a2]){
				if(ind1==cnt) ind1ele=arr1[a1];
				if(ind2==cnt) ind2ele=arr1[a1];
				cnt++;
				a1++;
			}
			else {
				if(ind1==cnt) ind1ele=arr2[a2];
				if(ind2==cnt) ind2ele=arr2[a2];
				cnt++;
				a2++;
			}
		}
		
		while(a1<arr1.length) {
			if(ind1==cnt) ind1ele=arr1[a1];
			if(ind2==cnt) ind2ele=arr1[a1];
			cnt++;
			a1++;	
		}
		
		while(a2<arr2.length) {
			if(ind1==cnt) ind1ele=arr2[a2];
			if(ind2==cnt) ind2ele=arr2[a2];
			cnt++;
			a2++;	
		}
		
		int sum = ind1ele+ind2ele;
		int ans = -1;
		
		if(sum%2==0) {
			 ans = sum/2;
		}
		else {
			 ans = ind2ele;
		}
		
		System.out.print(ans);
	}

}
