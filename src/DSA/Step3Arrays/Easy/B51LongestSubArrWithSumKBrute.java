package DSA.Step3Arrays.Easy;
import java.util.Scanner;
public class B51LongestSubArrWithSumKBrute {
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		
		int s,k;
		s=Sc.nextInt();
		
		System.out.print("Enter sum k = ");
		k=Sc.nextInt();
		
		int[] arr = new int[s];
		for(int i=0;i<s;i++) {
			arr[i]=Sc.nextInt();
		}
		
		int sum,lg=0,id1=0,id2=0;
		for(int i=0;i<s;i++) {
			sum=0;
			for(int j=i;j<s;j++) {
				sum=sum+arr[j];
				if(sum==k) {
					if((j-i+1)>lg) {
						lg=j-i+1;
						id1=i;
						id2=j;
					}
				}
			}
		}
		
		System.out.print("length is "+lg+" from index "+id1+" to "+"index "+id2);
	}

}
          