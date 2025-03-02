package DSA.Step3Arrays.Easy;
import java.util.Scanner;
public class A5LeftRotateArrayByOnePlace {
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		
		int s;
		System.out.print("Enter size of an array = ");
		s=Sc.nextInt();
		
		int [] arr = new int[s];
		for(int i=0;i<s;i++) {
			arr[i]=Sc.nextInt();
		}
		
		int temp = arr[0];
		for(int i=1;i<s;i++) {
			arr[i-1]=arr[i];
		}
		arr[s-1]=temp;
		
		for(int i=0;i<s;i++) {
			System.out.printf(arr[i]+" ");
		}
		
	}

}
