package DSA.Step3Arrays.Easy;
import java.util.Scanner;
public class A7RotateArrayByDPlacesUsingReverseFunc {
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		
		int s,d;
		System.out.print("Enter size = ");
		s=Sc.nextInt();
		
		int[] arr = new int[s];
		for(int i=0;i<s;i++) {
			arr[i]=Sc.nextInt();
		}
		
		System.out.print("Enter index to rotate = ");
		d=Sc.nextInt();
		
		A7RotateArrayByDPlacesUsingReverseFunc rt = new A7RotateArrayByDPlacesUsingReverseFunc();
		rt.reverse(arr,s-s,s-d-1);
		rt.reverse(arr,s-d,s-1);
		rt.reverse(arr,s-s,s-1);
		
		for(int i=0;i<s;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public void reverse(int arr[],int s,int d){
		while(s<=d) {
			int temp = arr[s];
			arr[s]=arr[d];
			arr[d]=temp;
			s++;
			d--;
		}
	 }
	 	
	}


