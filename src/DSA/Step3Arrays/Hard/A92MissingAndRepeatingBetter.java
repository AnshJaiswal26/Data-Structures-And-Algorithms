package DSA.Step3Arrays.Hard;

import java.util.Arrays;

public class A92MissingAndRepeatingBetter {
	public static void main(String args[]) {
		int[] arr = {4,6,2,1,5,5};
		int s =arr.length;
		
		int[] hash = new int[s+1];
		Arrays.fill(hash,0);
		
		int repeat=-1,missing=-1;
		
		for(int i=0;i<s;i++) {
			hash[arr[i]] = hash[arr[i]]+1;
		}
		
		for(int i=0;i<s+1;i++) {
			if(hash[i]==2) {
				repeat=i;
			}
			else if(hash[i]==0) {
				missing=i;
			}
			if(repeat!=-1 && missing!=-1) break;
		}
		System.out.print("Repeating element is "+repeat+" & missing element is "+missing);
	}

}
