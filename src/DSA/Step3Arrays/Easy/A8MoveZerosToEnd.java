package DSA.Step3Arrays.Easy;
import java.util.Scanner;
public class A8MoveZerosToEnd {
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		
		int s;
		s=Sc.nextInt();
		
		int [] arr = new int[s];
		for(int i=0;i<s;i++) {
			arr[i]=Sc.nextInt();
		}
		
		int j=-1;
		for(int i=0;i<s;i++) {
			if(arr[i]==0) {
				j=i;
				break;
			}
		}
		
		for(int i=j+1;i<s;i++) {
			if(arr[i]!=0) {
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
				j++;
			}
		}
		
		for(int i=0;i<s;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
