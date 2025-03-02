package DSA.Step3Arrays.Easy;
import java.util.Scanner;
import java.util.Arrays;
public class B42NumThatAppearsOnesAndOtherTwiceBetter {
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		
		int s;
		s=Sc.nextInt();
		
		int[] arr = new int[s];
		for(int i=0;i<s;i++) {
			arr[i]=Sc.nextInt();
		}
		int max = arr[0];
		for(int i=1;i<s;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		
		int[] hash = new int[max+1];
		Arrays.fill(hash,0);
		
		for(int i=0;i<s;i++) {
			hash[arr[i]] = hash[arr[i]]+ 1;
		}
		
		for(int i=0;i<max+1;i++) {
			if(hash[i]==1) {
				System.out.print(i);
			}
		}
		
	}

}
