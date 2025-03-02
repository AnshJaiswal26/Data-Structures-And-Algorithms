package DSA.Step3Arrays.Easy;
import java.util.Scanner;
public class B24FindMissingNumInArrayOptimal2 {
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		
		int s;
		s=Sc.nextInt();
		
		int[] arr = new int[s];
		for(int i=0;i<s;i++) {
			arr[i]=Sc.nextInt();
		}
		
		int XOR1=0,XOR2=0;
		int i;
		for( i=0;i<s;i++) {
			XOR2=XOR2^arr[i];
			XOR1=XOR1^(i+1);
		}
		XOR1=XOR1^(i+1);
		
		System.out.print("num is = "+(XOR1^XOR2));
	
		
	}

}
