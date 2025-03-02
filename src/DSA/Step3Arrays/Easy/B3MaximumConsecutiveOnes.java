package DSA.Step3Arrays.Easy;
import java.util.Scanner;
public class B3MaximumConsecutiveOnes {
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		
		int s;
		s=Sc.nextInt();
		
		int[] arr = new int[s];
		
		for(int i=0;i<s;i++) {
			arr[i]=Sc.nextInt();
		}
		
		int count=0,max=0;
		
		for(int i=0;i<s;i++) {
			if(arr[i]==1) {
				count++;
			}
			else {
			count=0;
			}
			if(count>max) {
				max=count;
			}
			
		}
		System.out.print("Maximum Consecutive 1's = "+max);
	}

}
