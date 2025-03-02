package DSA.Step3Arrays.Easy;
import java.util.Scanner;
public class B23FindMissingNumInArrayOptimal1 {
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		
		int s,m;
		System.out.print("Enter Size = ");
		s=Sc.nextInt();
		
		System.out.print("Enter max = ");
		m=Sc.nextInt();
		
		int[] arr = new int[s];
		for(int i=0;i<s;i++) {
			arr[i]=Sc.nextInt();
		}
		
		int sum0=0,sum = (m*(m+1))/2;
		
		for(int i=0;i<s;i++) {
			sum0 = sum0 +arr[i];
		}
		
		System.out.print("num is = "+(sum-sum0));
	}

}
