package DSA.Step3Arrays.Easy;
import java.util.Scanner;
public class B43NumThatAppearsOnesAndOtherTwiceOptimal {
	public static void main(String args[]) {
		Scanner Sc= new Scanner(System.in);
		
		int s;
		s=Sc.nextInt();
		
		int[] arr = new int[s];
		for(int i=0;i<s;i++) {
			arr[i]=Sc.nextInt();
		}
		
		int XOR = 0;
		for(int i=0;i<s;i++) {
			XOR = XOR^arr[i];
		}
		
		System.out.print(XOR);
	}

}
