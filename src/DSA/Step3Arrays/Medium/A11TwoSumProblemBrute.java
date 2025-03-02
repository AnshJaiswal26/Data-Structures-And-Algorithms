package DSA.Step3Arrays.Medium;
import java.util.Scanner;
public class A11TwoSumProblemBrute {
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		
		int s;
		s=Sc.nextInt();
		
		int target;
		target=Sc.nextInt();
		
		int[] arr = new int[s];
		for(int i=0;i<s;i++) {
			arr[i]=Sc.nextInt();
		}
		int c=0;
		for(int i=0;i<s;i++) {
			for(int j=0;j<s;j++) {
				
				if(i==j)continue;
				
				if(arr[i]+arr[j]==target) {
					System.out.print("ellements present on indexes = "+i+" & "+j);
					c++;
					break;
				}
			}
			if(c==1) {
				break;
			}
		}
	}

}
