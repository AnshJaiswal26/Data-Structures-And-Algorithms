package DSA.Step3Arrays.Easy;
import java.util.Scanner;
public class B41NumThatAppearsOnesAndOtherTwiceBrute {
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		
		int s;
		s=Sc.nextInt();
		
		int[] arr = new int[s];
		for(int i=0;i<s;i++) {
			arr[i]=Sc.nextInt();
		}
		
		int num,count=0;
		for(int i=0;i<s;i++) {
			num=arr[i];
			
			for(int j=0;j<s;j++) {
				if(arr[j]==num) {
					count++;
				 }
				}
			if(count==1) {
				System.out.print(num);
				break;
			}
			count=0;

		}
	}

}
