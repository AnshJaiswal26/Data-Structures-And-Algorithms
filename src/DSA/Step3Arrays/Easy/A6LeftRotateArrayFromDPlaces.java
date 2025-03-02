package DSA.Step3Arrays.Easy;
import java.util.Scanner;
public class A6LeftRotateArrayFromDPlaces {
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		
		int s,d;
		System.out.print("Enter Size of an array = ");
		s=Sc.nextInt();
		
		System.out.print("Enter index to rotate array = ");
		d=Sc.nextInt();
		
		int [] arr = new int[s];
		for(int i=0;i<s;i++) {
			arr[i]=Sc.nextInt();
		}
		A6LeftRotateArrayFromDPlaces rt = new A6LeftRotateArrayFromDPlaces();
		rt.rotatearray(arr,s,d);
		for(int i=0;i<s;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public void rotatearray(int arr[],int s,int d) {
		
		int [] temp = new int[d];
		for(int i=0;i<d;i++) {
			temp[i]=arr[i];
		}
		
		for(int i=d;i<s;i++) {
			arr[i-d]=arr[i];
		}
		
		for(int i=s-d;i<s;i++) {
			arr[i]=temp[i-(s-d)];
		}
		
	}

}
