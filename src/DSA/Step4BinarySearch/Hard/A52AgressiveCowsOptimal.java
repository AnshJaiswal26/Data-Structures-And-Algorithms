package DSA.Step4BinarySearch.Hard;

import java.util.Arrays;

public class A52AgressiveCowsOptimal {
	static boolean PlacingCows(int[] arr,int l,int cows,int dis) {
		int cntcows = 1;
		int lastcow = arr[0];
		
		for(int i=0;i<l;i++) {
			if(arr[i]-lastcow >= dis) {
				cntcows++;
				lastcow=arr[i];
			}
		}
		
		if(cntcows>=cows) {
			return true;
		}
		else {
			return false;
		}
	}
	
	static int MaxDistance(int[] arr,int l,int cows) {
		int s=1,e=arr[l-1]-arr[0];
		
		if(cows==2) {
			return arr[l-1]-arr[0];
		}
		
		while(s<=e) {
			int mid = s+(e-s)/2;
			if(PlacingCows(arr,l,cows,mid)==true) {
				s=mid+1;
			}
			else {
				e=mid-1;
			}
		}
		return e;
	}
	public static void main(String args[]) {
		int[] arr = {0, 3, 4, 7, 10, 9};
		int l = arr.length;
		int cows = 4;
		
		Arrays.sort(arr);
		
		int maxdis = MaxDistance(arr,l,cows);
		
		System.out.print(maxdis);
	}

}
