package DSA.Step3Arrays.Easy;
import java.util.Scanner;
public class A9LinearSearch {
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		
		int s;
		s=Sc.nextInt();
		
		int [] arr = new int[s];
		for(int i=0;i<s;i++) {
			arr[i]=Sc.nextInt();
		}
		
		int num;
		System.out.print("Enter num to search  =");
		num=Sc.nextInt();
		
		for(int i=0;i<s;i++) {
			if(arr[i] == num) {
			  System.out.print("Num present on Index ="+i );
			  break;
			}
		}
	}

}
