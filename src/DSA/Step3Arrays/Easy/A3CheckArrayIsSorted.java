package DSA.Step3Arrays.Easy;
import java.util.Scanner;
public class A3CheckArrayIsSorted {
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		
		int s;
		s=Sc.nextInt();
		
		int[] arr = new int[s];
		for(int i=0;i<s;i++) {
			arr[i]=Sc.nextInt();
		}
		
		int c=0;
		for(int i=0;i<s-1;i++) {
			if(arr[i+1]>=arr[i]) {
				c++;
			}
			else {
				System.out.print("not sorted");
				break;
			}
			
		}
		if(c==s-1) {
			System.out.print("sorted");
		}
	}

}
