package DSA.Step3Arrays.Medium;
import java.util.*;
public class A41MaximumSubArraySumBrute {
	public static void main(String args[]) {
		Scanner Sc =new Scanner(System.in);
		
		int[] arr = {-2,-3,4,-1,-2,1,5,-3};
		
		int s=arr.length,maxsum=0,sum;
		
		maxsum=Integer.MIN_VALUE;
		for(int i=0;i<s;i++) {
			sum=0;
			for(int j=i;j<s;j++) {
				sum=sum+arr[j];
			
				maxsum=Math.max(maxsum, sum);
				}
			}
		
		System.out.print(maxsum);
		}
	}


