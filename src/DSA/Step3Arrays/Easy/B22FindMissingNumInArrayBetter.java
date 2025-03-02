package DSA.Step3Arrays.Easy;
import java.util.Scanner;
import java.util.Arrays;
public class B22FindMissingNumInArrayBetter {
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		
		int s;
		System.out.print("Enter size = ");
		s=Sc.nextInt();
		
		int[] arr = new int[s];
		for(int i=0;i<s;i++) {
			arr[i]=Sc.nextInt();
		}
		
		int[] hash = new int[11];
		Arrays.fill(hash,0);
		
		for(int i=0;i<s;i++) {
			hash[arr[i]]=arr[i];
		}
		
		for(int i=1;i<hash.length;i++) {
			if(hash[i]==0) {
				System.out.print("num is = "+i);
				break;
			}
		}
	}
}
