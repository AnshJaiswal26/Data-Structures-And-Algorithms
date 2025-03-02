package DSA.Step4BinarySearch.Hard;

import java.util.Arrays;

public class A91MinimizeMaxDisBWGasStationBrute {
	static int MaxDis(int[] arr,int l,int GS) {
		int[] Sections = new int[l-1];
		Arrays.fill(Sections, 0);
		
		for(int st=1;st<=GS;st++) {
			int maxdis=-1,secind = -1;
			
			for(int i=0;i<l-1;i++) {
				
				int dis = arr[i+1]-arr[i];
				
				int seclen=dis/(Sections[i]+1);
				
				if(maxdis<seclen) {
					maxdis=seclen;
					secind=i;
				}	
			}
			Sections[secind]++;		
		}
		
		int maxans=-1;
		
		for(int i=0;i<l-1;i++) {
			int md = (arr[i+1]-arr[i])/(Sections[i]+1);
			
			if(maxans<md) {
				maxans=md;
			}
		}
		
		return maxans;
	}
	public static void main(String args[]) {
		int [] arr = {1, 13, 17, 23};
		int l = arr.length;
		int GS = 5;
		
		int ans = MaxDis(arr,l,GS);
		System.out.print(ans);
	}

}
