package DSA.Step3Arrays.Easy;
import java.util.Scanner;
public class A1LargestElementInArr {
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		
		int s;
		s=Sc.nextInt();

		int[] arr = new int[s];
		for(int i=0;i<s;i++) {
			arr[i]=Sc.nextInt();
		}
		
		int largest=arr[0];
		for(int i=1;i<s;i++) {
			if(arr[i]>largest) {
				largest=arr[i];			
			}
		}
		System.out.print("largest element = "+largest);
	}

}
