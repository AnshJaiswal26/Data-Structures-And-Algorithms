package DSA.Step3Arrays.Medium;
import java.util.Scanner;
import java.util.Arrays;
public class A13TwoSumProblemoptimal {
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		
		int t;
		t=Sc.nextInt();
		
		int[] arr = {1,2,7,3,4};
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		int n[]= twosum(arr,t);
		System.out.println("elements present on index "+n[0]+" & "+n[1]);
	}
	
	public static int[] twosum(int arr[],int t) {
		int left = 0,s=arr.length;
		int right = s-1;
		int sum=0;
		int[] ans = new int[2];
		ans[0]=ans[1]=-1;
		while(left<right) {
			sum = arr[left]+arr[right];
			
			if(sum == t ) {
				ans[0]=left;
				ans[1]=right;
				return ans;
			}
			else if(sum<t) {
				left++;
			}
			else {
				right--;
			}
		}
		return ans;
	}

}
