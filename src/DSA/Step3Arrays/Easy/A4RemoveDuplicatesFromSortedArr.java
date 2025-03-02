package DSA.Step3Arrays.Easy;
import java.util.Scanner;
public class A4RemoveDuplicatesFromSortedArr {
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		
		int s;
		s=Sc.nextInt();
		
		int [] arr = new int[s];
		for(int i=0;i<s;i++) {
			arr[i]=Sc.nextInt();		
		}
		
		int i=0;
		for(int j=1;j<s;j++) {
			if(arr[i]!=arr[j]) {
				arr[i+1]=arr[j];
				i++;
			}
		}
		
		for(int k=0;k<i+1;k++) {
			System.out.print(arr[k]+" ");		
		}
	}
}
