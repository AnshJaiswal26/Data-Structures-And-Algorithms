package DSA.Step3Arrays.Easy;
import java.util.Scanner;
public class B21FindMissingNumInArrayBrute {
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		
		int s,m;
		System.out.print("Enter size = ");
		s=Sc.nextInt();
		
		System.out.print("Enter max num of arr = ");
		m=Sc.nextInt();
		
		int [] arr = new int[s];
		for(int i=0;i<s;i++) {
			arr[i]=Sc.nextInt();
		}
		
		for(int i=1;i<m;i++) {
			int flag = 0;
			for(int j=0;j<s;j++) {
				if(arr[j]==i) {
					flag = 1;
					break;
				}
			}
			if(flag == 0) {
				System.out.print("num is = "+i );
				break;
			}
		}
		
	}

}
